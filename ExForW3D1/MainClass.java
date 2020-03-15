package mypackage;

import java.util.Scanner;
import java.util.Random;

public class MainClass {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.println("How many rows does the class have?");
        int rows = input.nextInt();//πληθος σειρων
        System.out.println("How many students does tha class have?");
        int students = input.nextInt();//πληθος μαθητων
        int seatsPerRow = students / rows;//θεσεις ανα σειρα
        int lastRow = seatsPerRow + students % rows;//θεσεις τελευταιας σειρας
        String seatsOfStudents[][] = new String[rows][seatsPerRow];//οι μαθητες καθε σειρας εκτος απο την τελευταια
        String seatsOfLastRow[] = new String[lastRow];//οι μαθητες τις τελευταιας σειρας
        boolean []fullSeats = new boolean[students];
        for(int i =0;i<students; i++){
            fullSeats[i]=false;
        }
        int counter=students;//μετραμε ποσες αδειες θεσεις υπαρχουν
        for (int i = 0; i < students; i++) {
            int randomSeat = random.nextInt(students);//τυχαια αδεια θεση
            //fullSeats[randomSeat]=true;
            
            while(fullSeats[randomSeat] == true){               
                    randomSeat = random.nextInt(students);  
            }
            System.out.println(randomSeat);
            fullSeats[randomSeat]=true;
            
            if (randomSeat / seatsPerRow < students / seatsPerRow) {
                System.out.println(counter+" seats are empty!");
                System.out.println("Please enter student's name for seat ["+randomSeat / seatsPerRow+"]["+randomSeat % seatsPerRow+"]");
                seatsOfStudents[randomSeat / seatsPerRow][randomSeat % seatsPerRow] = input.next();
                //seatsOfLastRow[randomSeat / seatsPerRow] = 
                counter--;
            }
            else{
                System.out.println(counter+" seats are empty");
                System.out.println("Please enter student's name for seat ["+(randomSeat / seatsPerRow-1)+"]["+(randomSeat % seatsPerRow+ rows)+"]");
                seatsOfLastRow[randomSeat/seatsPerRow] = input.next();
                counter--;
            }
        }
        for(int i=0; i<seatsOfStudents.length;i++){
            for(int j=0; j<seatsOfStudents[i].length; j++){
                System.out.print(seatsOfStudents[i][j]+ "\t");
            }
            System.out.println("");
        }
        //for(int i=0; i<seatsOfLastRow.length;i++){
            System.out.print(seatsOfLastRow[lastRow-1]+"\t");
        //}
        
    }

}
