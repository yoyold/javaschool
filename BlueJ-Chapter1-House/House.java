
/**
 * 
 * @author (Lukas Dony) 
 * @version (15.11.22)
 */
public class House
{
    
    Triangle roof;
    Circle sun;
    Square house;
    Square door;

    // constructor for creating the house picture
    public House()
    {
        roof = new Triangle();
        sun = new Circle();
        house = new Square();
        door = new Square();
        
        // make all the objects visible (draw to canvas)
        sun.makeVisible();
        house.makeVisible();
        roof.makeVisible();
        door.makeVisible();
        
        // adjustments for sun object
        sun.changeColor("yellow");
        sun.moveVertical(-90);
        sun.moveHorizontal(220);
        sun.changeSize(40);

        // adjustments for house
        house.changeColor("black");
        house.moveVertical(120);
        house.moveHorizontal(-80);
        
        // adjustments for roof
        roof.changeColor("red");
        roof.changeSize(40, 80);
        roof.moveVertical(60);
        roof.moveHorizontal(51);
        
        // adjustments for the house door
        door.changeColor("green");
        door.changeSize(15);
        door.moveVertical(164);
        door.moveHorizontal(-36);
        
    }

    // move all drawn objects to the right
    void moveRight() {
        roof.moveRight();
        house.moveRight();
        sun.moveRight();
        door.moveRight();
    }
    

}
