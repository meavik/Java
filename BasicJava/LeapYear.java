package basicjava;

import java.util.Scanner;

public class BasicJava {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;
        System.out.print("Enter an year: ");
        year = input.nextInt();
        if(year%4==0){
            if(year%100==0){
            if(year%400==0){
            System.out.println(year+" is Leap Year.");
            }
            else{
            System.out.println(year+" is not Leap Year.");
            }
            }
            else{
            System.out.println(year+" is Leap Year.");
            }
        }
        else{
       System.out.println(year+" is not Leap Year.");
        }
    }
}
