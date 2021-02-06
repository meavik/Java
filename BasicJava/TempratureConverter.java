package basicjava;
//import java.util.Scanner;
//F = ((9/5)*C)+32
class CelsiusToFarenhite{
    float farenhite,celsius;
    CelsiusToFarenhite(float celsius){
        this.celsius = celsius;
    }
    void convert(){
        farenhite = celsius*1.8f+32;
    System.out.println("Temprature in Farenhite: "+farenhite);
    }
}
public class BasicJava {

    public static void main(String[] args){
       CelsiusToFarenhite obj = new CelsiusToFarenhite(15f);
       obj.convert();
   }
}
