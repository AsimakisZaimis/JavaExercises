/*
Write a Java program to print the result of the following operations for x = 1 and y =2.
After every operation print the result of the whole operation, x and y.
a. -x + x++ * 2
b. (x++ + --y) + --y
c. x + x
At the end, after all the operations print the values of x and y. 
 */
package mypackage;

public class MainClass {

    public static void main(String[] args) {
        byte x = 1;
        byte y = 2;
        byte result = (byte) (-x + x++ * 2);
        System.out.println("a. -x + x++ * 2 = " + result);
        result = (byte) ((x++ + --y) + --y);
        System.out.println("b. (x++ + --y) + --y = " + result);
        result = (byte) (x + x);
        System.out.println("c. x + x = " + result);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

}
