//import stuff here!
import java.util.*;
//Your code here
public class Program6 {
    public static void main(String[] args){
        final double PI = 3.14159;
        double radius = 0;
        //scanner
        Scanner formula = new Scanner (System.in);
        //userinput
        System.out.println("Enter the radius: ");
        radius = formula.nextInt();
        //formulas
        radius = radius;
        double diameter = 2 * radius;
        double area = PI * radius * radius;
        double circumference = PI * diameter;
        //print
        System.out.printf("The radius of the circle is " + "%.3f\n", radius);
        System.out.printf("The diameter of the circle is " + "%.3f\n", diameter);
        System.out.printf("The area of the circle is " + "%.3f\n", area);
        System.out.printf("The circumference of the circle is " + "%.3f\n", circumference);
        
    }
}
//Paste console output below:
/*
Enter the radius: 
22
The radius of the circle is 22.000
The diameter of the circle is 44.000
The area of the circle is 1520.530
The circumference of the circle is 138.230


*/
