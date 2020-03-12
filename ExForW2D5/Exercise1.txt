/* Write a Java program to print the area and perimeter of a circle. 
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586 
Use memory-friendly variables and print the result with printf.
 */
package mypackage;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        double area;
        double perimeter;
        Scanner input = new Scanner(System.in);
        System.out.printf("Give me the radius of the circle\n");
        float radius = input.nextFloat();
        perimeter = (2 * Math.PI * radius);
        area = Math.PI * (radius * radius);
        System.out.printf("The perimeter of the circle is :%.14f\n", perimeter);
        System.out.printf("The area of the circle is :%.14f\n", area);

    }

}

