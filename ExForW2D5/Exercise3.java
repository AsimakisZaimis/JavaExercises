/*
 Write a Java program to print the area and perimeter of a rectangle. 
Test Data:
Width = 5.5 Height = 8.5
Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20 
 */
package mypackage;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float width;
        float height;
        System.out.println("Give the width : ");
        width = input.nextFloat();
        System.out.println("Give the height : ");
        height = input.nextFloat();
        float area = width * height;
        float perimeter = 2 * (width + height);

        System.out.printf("Area is, %.1f * %.1f = %.2f\n", width, height, area);
        System.out.printf("Perimeter is 2 *( %.1f + %.1f) = %.2f\n ", width, height, perimeter);

    }

}
