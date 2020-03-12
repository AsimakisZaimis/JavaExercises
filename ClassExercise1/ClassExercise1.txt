package classexercise1;

import java.util.Scanner;

public class ClassExercise1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = input.next();
        System.out.println("Ok " + name + ", What's your gender?");
        String gender = input.next();
        System.out.println("How old are you " + name + "?");
        int age = input.nextInt();
        while (age < 0) {
            System.out.println("Give me a correct age");
            age = input.nextInt();
        }
        ageValidation(age);

        if (age > 5) {
            favoriteSeason(name);
            bmi(name);
            luckyDayNumber(age, name, gender);
        }
        else {
        }
    }

    static void ageValidation(int age) {
        if (age <= 5) {
            System.out.println("You are too young for this app. Come back in " + (6 - age) + " years when you will be a student.In 1980 you weren't born and 2040 you will be " + (age + 20));
        } else if (age >= 6 && age <= 18) {
            System.out.println("Oh you are a student. Keep up... " + (18 - age) + "more years left and afterwards you will make money.In 1980 you weren't born and in 2040 you will be " + (age + 20));
        } else if (age >= 19 && age <= 40) {
            System.out.println("Well, you must be employed. You finished school " + (age - 18) + " years ago.");
        } else if (age > 40) {
            System.out.println("You are too old for this app. In 1980 you were " + (age - 40) + "and in 2040 you will be " + (age + 20));
        }
        //return age;
    }

    static void favoriteSeason(String name) {
        Scanner input = new Scanner(System.in);
        System.out.println("What's your favorite season " + name + "?");
        System.out.println("1. Winter\n" + "2. Spring\n" + "3. Summer\n" + "4. Autumn ");
        int favoriteSeason = input.nextInt();
        if (favoriteSeason == 1) {
            System.out.println("It must be cold outside");
        } else if (favoriteSeason == 2) {
            System.out.println("Ohh, flowers are very beautiful these days");
        } else if (favoriteSeason == 3) {
            System.out.println("Let's go for swimming");
        } else if (favoriteSeason == 4) {
            System.out.println("The trees are full of brown leaves");
        }

    }

    static void bmi(String name) {
        Scanner input = new Scanner(System.in);
        System.out.println(name + ", could you please tell me your height and weight?");
        double height = input.nextDouble();
        int weight = input.nextInt();
        double bmi = (weight / (height * height));
        System.out.println("Your bmi is " + bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight   = < 18.5");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Normal weight = 18.5 < bmi < 25");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Overweight    = 25 < bmi < 30");
        } else {
            System.out.println("Obesity       = BMI of 30 or greater ");
        }
    }

    static void luckyDayNumber(int age, String name, String gender) {
        Scanner input = new Scanner(System.in);
        int ageInDays = age * 365;
        int sumOfDigits = 0;
        //while(int i < 10000){
        sumOfDigits = ageInDays % 10;
        sumOfDigits += (ageInDays / 10) % 10;
        sumOfDigits += (ageInDays / 100) % 10;
        sumOfDigits += (ageInDays / 1000) % 10;
        sumOfDigits += (ageInDays / 10000) % 10;

        int luckyDayNumber = sumOfDigits % 7;
        String luckyDay = "";
        if (luckyDayNumber == 0) {
            luckyDay = "Monday";
        } else if (luckyDayNumber == 1) {
            luckyDay = "Tuesday";
        } else if (luckyDayNumber == 2) {
            luckyDay = "Wednesday";
        } else if (luckyDayNumber == 3) {
            luckyDay = "Tursaday";
        } else if (luckyDayNumber == 4) {
            luckyDay = "Friday";
        } else if (luckyDayNumber == 5) {
            luckyDay = "Satarday";
        } else if (luckyDayNumber == 1) {
            luckyDay = "Sunday";
        }
        System.out.println("Your lucky day is " + luckyDay);
        if (luckyDayNumber == 2 && age >= 20 && age < 40) {
            if (age <= 25) {
                System.out.println("Welcome " + name);
            } else if (age > 25 && gender.equals("M")) {
                System.out.println("Welcome Mr." + name);
            } else if (gender.equals("F")) {
                System.out.println("Are you married?");
                String isMarried = input.next();
                if (isMarried.equals("yes")) {
                    System.out.println("Welcome Mrs." + name);
                } else if (isMarried.equals("no")) {
                    System.out.println("Welcome Ms." + name);
                }
            }

        } else if (age < 20 || age > 40) {
            System.out.println("You cannot enter the club. You are not between 20 and 40");
        } else if (luckyDayNumber != 2) {
            System.out.println("You cannot enter the club. Your lucky day isn't Wednesday");
        }

    }
}
