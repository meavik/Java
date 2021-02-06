package basicjava;
//import java.util.Scanner;
class Rectangle{
    int length,breadth;
    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    void areaOfRectangle(){
    System.out.println("Area of rectangle: "+length*breadth);
    }
}
public class BasicJava {

    public static void main(String[] args){
       Rectangle obj = new Rectangle(10,8);
       obj.areaOfRectangle();
   }
}
