package basicjava;

import java.util.Scanner;

public class BasicJava {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Enter a number: ");
        number = input.nextInt();
        System.out.println(number>>3);//right-shift means divide by 2;
        System.out.println(number<<3);//left-shift means multiply by 2;
    }
        
}
