______#######________method1_______######_________
import java.util.Scanner;
import java.util.Arrays;

public class Check_Anagram {
    
    public static boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length())
            return false;
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);
        return Arrays.equals(s1Array, s2Array);
    }
    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String str1,str2;
        System.out.println("Enter a string: ");
        str1 = (input.nextLine()).replaceAll("\\s", "").toLowerCase();
        System.out.println("Enter another string: ");
        str2 = (input.nextLine()).replaceAll("\\s", "").toLowerCase();
        
        if(isAnagram(str1,str2))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
}

______#######________method2_______######_________
