// Get message ("Perfect, Good, Pass, Fail") based on grade (A, B, C-D, the rest). 

public class Exercise5{

	public static void main(String [] args){
		char grade = args[0].charAt(0);
		switch(grade){
			case 'A':
				System.out.println("Perfect");
				break;
			case 'B':
				System.out.println("Very good");
				break;	
			case 'C':
				System.out.println("Good");
				break;
			case 'D':
				System.out.println("Well done");
				break;
			case 'E':
				System.out.println("Pass");
				break;
			case 'F':
				System.out.println("Fail");
				break;
			default:
				System.out.println("Invalid grade"); 
				break;	

		}

	}


}