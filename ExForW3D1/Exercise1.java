/*
What class in school are you going according to age;
   Use an if-else-if.
   For example: 5-12 dimotiko, ...
   Can you use a switch statement?
*/

import java.util.Scanner;

public class Exercise1{

	public static void main(String [] args){
		int age = Integer.parseInt(args[0]);
		Scanner input = new Scanner(System.in);	
		
		while(age<0){
			System.out.println("Give me o correct age");			
			age = input.nextInt();
		}
		

		if(age>=0){
			if(age<=5)
				System.out.println("Too young for going in school");
			else if(age<=11)
				System.out.println("dimotiko");
			else if(age<=15)
				System.out.println("gimnasio");
			else if(age<=18)
				System.out.println("likeio");
			else if(age>18)
				System.out.println("You have finished school");
		}
		
	//if we wantd to use a switch statement we should make a case for each age
		



					

	}


}