/*
Create a program that stores the names of your 4 best friends in an array.
Then print these names from the array. Use for-traditional, for enhanced, while, do-while.
*/
public class Exercise9{
	
	public static void main(String [] args){
		String arrayOfNames[] = {"Nick","George","Maria", "Jack" };
		for(int i=0; i<arrayOfNames.length; i++){
			System.out.println(arrayOfNames[i]);
			}
		for(String names: arrayOfNames){
			System.out.println(names);
		}
		
		int j=0;
		while(j < arrayOfNames.length){
			System.out.println(arrayOfNames[j]);
			j++;
		}

		int k=0;
		do{
			System.out.println(arrayOfNames[k]);
			k++;
		}while(k<arrayOfNames.length);
		

	}



}