
//What to do every day (switch). Monday-Friday: go to work. Sat-Sun: relaxing
import java.util.Scanner;
public class Exercise2{

	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		String day = args[0];
		
		switch (day) {
			
            		case "Monday":
                		System.out.println("Go to work");
				break;
           		case "Tuesday":
               			System.out.println("Go to work");
				break;
			case "Wednesday":
                		System.out.println("Go to work");
				break;
           		case "Thursday":
               			System.out.println("Go to work");
				break;
			case "Friday":
                		System.out.println("Go to work");
				break;
           		case "Saturday":
               			System.out.println("Relaxing");
				break;
			case "Sunday":
				System.out.println("Relaxing");
				break;
			default:
				System.out.println("Invalid day");
				
			
        }
	


	}


}