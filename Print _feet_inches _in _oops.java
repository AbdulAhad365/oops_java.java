//Create a class ―Distance‖ with two constructors (no argument, and two argument), two data members (feet
//and inches). Also create display function which displays all data members.

import java.util.Scanner;
class Distance{
    private int feet;
    private int inches;
    Distance(){
        System.out.println("Dispalyed values are:");
    }
    Distance(int a,int b){
        feet=a;
        inches=b;
    }
    void display(){
        System.out.println("Since the feet is "+feet);
        System.out.println("Since the inches are "+inches);
    }

}
public class labtask3 {
    public static void main(String[] args) {
        Distance d=new Distance();
        Scanner s=new Scanner(System.in);
        int a,b;
        System.out.println("Enter the feet");
        a=s.nextInt();
        System.out.println("Enter the inches:");
        b=s.nextInt();
        Distance d1=new Distance(a,b);
        System.out.println();
        System.out.println("*************");
        System.out.println("0 values will be printed for the empty constructor display");
        System.out.println("*************");
        d.display();
        System.out.println();
        System.out.println("Your original values are:");
        System.out.println();
        System.out.println();
        System.out.println("*************");
        d1.display();
        System.out.println("*************");
    }
}
