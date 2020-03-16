
package exercise1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Asimakis
 */
public class Exercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Give me information about your family");
        System.out.println("NAME        AGE        HEIGHT(m)    WEIGHT(kg)");
        String filename = "C:\\Users\\Asimakis\\Documents\\NetBeansProjects\\ExForW3D2\\familyInformationForExercise1.txt";
        File file = new File(filename);
        FileWriter fileWriter = new FileWriter(file, true);
        PrintWriter writer = new PrintWriter(fileWriter);
        
        String details = input.next();
        while(!details.equals("exit")){
            writer.print(details+"\t");
            System.out.println("Person was successfully created");
            details = input.next();
            for(int i=0; i<3; i++){
                writer.print(details+"\t");   
                details = input.next();
               
            }
            writer.println();
            
        }
        String.format(filename, args);
        writer.close();
        
        printTextFromFileUsingScanner(file);
        
    }
    
    public static void printTextFromFileUsingScanner(File file) throws FileNotFoundException {
        Scanner input = new Scanner(file);
        while (input.hasNext()) {
            String line = input.nextLine();
            System.out.println(line);
        }
        input.close();
    }
    
}
