/*
Program should ask your weight and planet.
Compute your weight on the planet based on the table below:
#    Planet    Relative gravity
1    Venus        0.78
2    Mars        0.39
3    Jupiter    2.65
4    Saturn    1.17
5    Uranus    1.05
6    Neptune    1.23
So, for example, if your weight is 80 kg on earth,
then you would weigh just over 31 kg on Mars,
since Mars' gravity is 0.39 times earth's gravity. (80 * 0.39 is 31.20)
*/
 

import java.util.Scanner;

public class Exercise7{
	
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("What's your weigth?");
		float weight = input.nextFloat();
		System.out.println("Which is the planet you are standing on?");
		String planet = input.next();
		switch(planet){
			case "Venus":
				weight = (float) (0.78*weight);
				System.out.printf("Your weight on Venus is %.2f",weight);
				break;
			case "Mars":
				weight = (float) 0.39*weight;
				System.out.printf("Your weight on Mars is %.2f",weight);
				break;
			case "Jupiter":
				weight = (float) 2.65*weight;
				System.out.printf("Your weight on Jupiter is %.2f",weight);
				break;
			case "Saturn":
				weight = (float) 1.17*weight;
				System.out.printf("Your weight on Saturn is %.2f",weight);
				break;
			case "Uranus":
				weight = (float) 1.05*weight;
				System.out.printf("Your weight on Uranus is %.2f",weight);
				break;
			case "Neptune":
				weight = (float) 1.23*weight;
				System.out.printf("Your weight on Neptune is %.2f",weight);
				break;
		}
		

	}


}