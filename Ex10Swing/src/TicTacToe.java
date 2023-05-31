import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.TextAttribute;
import java.util.HashMap;
import java.util.Map;

public class TicTacToe extends JFrame {
    private JButton[][] buttons;
    private boolean isCrossTurn;
    private JLabel statusLabel;

    public TicTacToe() {
        setTitle("Tic Tac Toe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLayout(new BorderLayout());
        setLookAndFeel();

        statusLabel = new JLabel("Spieler X ist am Zug");
        Font labelFont = statusLabel.getFont();
        statusLabel.setFont(new Font(labelFont.getName(), Font.BOLD, 20));
        statusLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(statusLabel, BorderLayout.NORTH);

        JPanel gamePanel = new JPanel();
        gamePanel.setLayout(new GridLayout(3, 3));
        gamePanel.setBackground(Color.BLACK);
        add(gamePanel, BorderLayout.CENTER);

        buttons = new JButton[3][3];
        isCrossTurn = true;

        ActionListener buttonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton button = (JButton) e.getSource();
                if (button.getText().isEmpty()) {
                    if (isCrossTurn) {
                        button.setText("X");
                        formatButtonAsX(button);
                        statusLabel.setText("Spieler O ist am Zug");
                    } else {
                        button.setText("O");
                        formatButtonAsO(button);
                        statusLabel.setText("Spieler X ist am Zug");
                    }
                    isCrossTurn = !isCrossTurn;
                    button.setEnabled(false);

                    if (checkWin()) {
                        String winner = isCrossTurn ? "O" : "X";
                        showResultPopup("Spieler " + winner + " hat gewonnen!");
                        resetGame();
                    } else if (isBoardFull()) {
                        showResultPopup("Unentschieden!");
                        resetGame();
                    }
                }
            }
        };

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                buttons[row][col] = new JButton();
                buttons[row][col].setFont(new Font(labelFont.getName(), Font.BOLD, 40));
                buttons[row][col].setOpaque(true);
                buttons[row][col].setBackground(Color.WHITE);
                buttons[row][col].setFocusable(false); // Disable focus traversal
                buttons[row][col].addActionListener(buttonListener);
                gamePanel.add(buttons[row][col]);
            }
        }

        JButton resetButton = new JButton("Neues Spiel");
        resetButton.setFont(new Font(labelFont.getName(), Font.BOLD, 16));
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetGame();
            }
        });
        add(resetButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void formatButtonAsX(JButton button) {
        Font buttonFont = button.getFont();
        Map<TextAttribute, Object> attributes = new HashMap<>(buttonFont.getAttributes());
        attributes.put(TextAttribute.FAMILY, "Arial");
        attributes.put(TextAttribute.SIZE, 40);
        attributes.put(TextAttribute.WEIGHT, TextAttribute.WEIGHT_BOLD);
        button.setFont(Font.getFont(attributes));
    }

    private void formatButtonAsO(JButton button) {
        Font buttonFont = button.getFont();
        Map<TextAttribute, Object> attributes = new HashMap<>(buttonFont.getAttributes());
        attributes.put(TextAttribute.FAMILY, "Courier New");
        attributes.put(TextAttribute.SIZE, 40);
        attributes.put(TextAttribute.WEIGHT, TextAttribute.WEIGHT_BOLD);
        button.setFont(Font.getFont(attributes));
    }

    private boolean checkWin() {
        // Überprüfen der Reihen
        for (int row = 0; row < 3; row++) {
            if (!buttons[row][0].getText().isEmpty() &&
                    buttons[row][0].getText().equals(buttons[row][1].getText()) &&
                    buttons[row][0].getText().equals(buttons[row][2].getText())) {
                return true;
            }
        }

        // Überprüfen der Spalten
        for (int col = 0; col < 3; col++) {
            if (!buttons[0][col].getText().isEmpty() &&
                    buttons[0][col].getText().equals(buttons[1][col].getText()) &&
                    buttons[0][col].getText().equals(buttons[2][col].getText())) {
                return true;
            }
        }

        // Überprüfen der Diagonalen
        if (!buttons[0][0].getText().isEmpty() &&
                buttons[0][0].getText().equals(buttons[1][1].getText()) &&
                buttons[0][0].getText().equals(buttons[2][2].getText())) {
            return true;
        }

        if (!buttons[0][2].getText().isEmpty() &&
                buttons[0][2].getText().equals(buttons[1][1].getText()) &&
                buttons[0][2].getText().equals(buttons[2][0].getText())) {
            return true;
        }

        return false;
    }

    private boolean isBoardFull() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (buttons[row][col].getText().isEmpty()) {
                    return false;
                }
            }
        }
        return true;
    }

    private void resetGame() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                buttons[row][col].setText("");
                buttons[row][col].setEnabled(true);
                buttons[row][col].setBackground(Color.WHITE);
            }
        }
        isCrossTurn = true;
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
