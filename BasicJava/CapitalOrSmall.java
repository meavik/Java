package basicjava;

import java.util.Scanner;

public class BasicJava {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char alphabet;
        System.out.print("Enter an alphabet: ");
        alphabet = input.next().charAt(0);
        if(alphabet>='a' && alphabet<='z'){
        System.out.println("Small Letter.");
        }
        else if(alphabet>='A'&&alphabet<='Z'){
        System.out.println("Capital letter.");
        }
        else{
        System.out.println("Not a letter.");
        }
    }
        
}
