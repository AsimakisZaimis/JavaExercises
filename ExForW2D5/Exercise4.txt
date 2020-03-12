/*
 Write a Java program to convert seconds to hour, minute and seconds.
 */
package mypackage;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        short seconds = input.nextShort();
        byte secToHours = (byte) (seconds / 3600);
        byte secToMins = (byte) (seconds / 60 - (secToHours) * 60);
        byte secToSecs = (byte) (seconds % 60);
        System.out.printf("Hours %d: ", secToHours);
        System.out.printf("Minutes %d: ", secToMins);
        System.out.printf("Seconds %d: ", secToSecs);
    }

}
