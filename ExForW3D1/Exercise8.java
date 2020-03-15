
// Use ternary to return a message child or adult. Older than 18 is adult.

public class Exercise8{

	public static void main(String [] args){
		
		int age = Integer.parseInt(args[0]);		
		String message = (age<18)?"Its a child":"Its an adult";
		System.out.println(message);
	}

}