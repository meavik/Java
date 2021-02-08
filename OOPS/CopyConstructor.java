package basicjava;
//import java.util.Scanner;
class Student{
    int id;String name;
    Student(int id,String name){
        this.id = id;
        this.name = name;
    }
    Student(Student ref){
        this.id = ref.id;
        this.name = ref.name;
    }
    void show(){
    System.out.println(name+" "+id);
    }
}
public class BasicJava {  
 public static void main(String args[]){  
     Student stu1 = new Student(100,"Shaun");
     Student stu2 = new Student(stu1);
     stu1.show();
     stu2.show();
 }
} 
