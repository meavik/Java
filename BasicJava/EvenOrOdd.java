package basicjava;

import java.util.Scanner;

public class BasicJava {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        boolean a;
        System.out.print("Enter a number: ");
        number = input.nextInt();
        a = (number%2==0)? true:false;
        if(a){
            System.out.println("Even");
        }
        else{
        System.out.println("Not even");
        }
    }
        
}
