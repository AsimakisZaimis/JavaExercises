/*
Based on age what can you do?
lt 16>>You cannot drive
16-17>>You can drive but not vote
18-21>>You can vote but not drink
gt 22>>You can do anything 
*/

import java.util.Scanner;

public class Exercise6{

	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int age = Integer.parseInt(args[0]);
		while(age<0){
			System.out.println("Give me o correct age");			
			age = input.nextInt();
		}

		if(age<16)
			System.out.println("You cannot drive");
		else if(age>=16 && age<=17)
			System.out.println("You can drive but not vote");
		else if(age>=18 && age<=21)
			System.out.println("You can vote but not drink");
		else 
			System.out.println("You can do everything");

	}


}