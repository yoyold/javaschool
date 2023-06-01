import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe extends JFrame {
    private JButton[][] buttons;
    private JLabel statusLabel;
    private TicTacToeGame game;

    public TicTacToe() {
        setTitle("Tic Tac Toe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLookAndFeel();

        statusLabel = new JLabel("Spieler X ist am Zug");
        statusLabel.setFont(new Font(statusLabel.getFont().getName(), Font.BOLD, 20));
        statusLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(statusLabel, BorderLayout.NORTH);

        JPanel gamePanel = new JPanel();
        gamePanel.setLayout(new GridLayout(3, 3));
        add(gamePanel, BorderLayout.CENTER);

        buttons = new JButton[3][3];
        game = new TicTacToeGame();

        ActionListener buttonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton button = (JButton) e.getSource();
                int row = (int) button.getClientProperty("row");
                int col = (int) button.getClientProperty("col");

                if (game.makeMove(row, col)) {
                    button.setText(game.getCurrentPlayerSymbol());
                    button.setEnabled(false);

                    if (game.checkWin()) {
                        String winner = game.getCurrentPlayerSymbol();
                        showResultPopup("Spieler " + winner + " hat gewonnen!");
                        resetGame();
                    } else if (game.isBoardFull()) {
                        showResultPopup("Unentschieden!");
                        resetGame();
                    } else {
                        game.switchPlayer();
                        statusLabel.setText("Spieler " + game.getCurrentPlayerSymbol() + " ist am Zug");
                    }
                }
            }
        };

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                buttons[row][col] = new JButton();
                buttons[row][col].setFont(new Font(buttons[row][col].getFont().getName(), Font.BOLD, 40));
                buttons[row][col].setFocusable(false);
                buttons[row][col].putClientProperty("row", row);
                buttons[row][col].putClientProperty("col", col);
                buttons[row][col].addActionListener(buttonListener);
                gamePanel.add(buttons[row][col]);
            }
        }

        JButton resetButton = new JButton("Neues Spiel");
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetGame();
            }
        });
        add(resetButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void resetGame() {
        game.reset();
        for (JButton[] buttonRow : buttons) {
            for (JButton button : buttonRow) {
                button.setText("");
                button.setEnabled(true);
            }
        }
        statusLabel.setText("Spieler X ist am Zug");
    }

    private void showResultPopup(String message) {
        JOptionPane.showMessageDialog(this, message, "Spielende", JOptionPane.INFORMATION_MESSAGE);
    }

    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TicTacToe());
    }
}
