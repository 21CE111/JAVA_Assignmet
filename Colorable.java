//Name : Rushit Rabadiya
//ID   : 21CE111
/*AIM:Design an interface named Colorable with a void method named howToColor(). 
Every class of a colorable object must implement the Colorable interface. Design a 
class named Square that extends GeometricObject and implements Colorable. 
Implement howToColor to display the message Color all four sides. The Square
class contains a data field side with getter and setter methods, and a constructor for 
constructing a Square with a specified side. The Square class has a private double 
data field named side with its getter and setter methods. It has a no-arg constructor to 
create a Square with side 0, and another constructor that creates a Square with the 
specified side */
public interface Colorable {

    public void howToColor();
    
}
