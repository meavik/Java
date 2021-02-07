package basicjava;

import java.util.Scanner;

public class BasicJava {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char alphabet;
        System.out.print("Enter an alphabet: ");
        alphabet = input.next().charAt(0);
        if(alphabet == 'a' || alphabet == 'A'){
        System.out.println("Vowel");
        }
        else if(alphabet == 'e' || alphabet == 'E'){
        System.out.println("Vowel");
        }
        else if(alphabet == 'i' || alphabet == 'I'){
        System.out.println("Vowel");
        }
        else if(alphabet == 'o' || alphabet == 'O'){
        System.out.println("Vowel");
        }
        else if(alphabet == 'u' || alphabet == 'U'){
        System.out.println("Vowel");
        }
        else{
        System.out.println("Consonant");
        }
    }
        
}
