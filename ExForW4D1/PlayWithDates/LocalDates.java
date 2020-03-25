package localdates;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class LocalDates {

    public static void main(String[] args) {
        ArrayList<Bootcamp> listOfBootcamps = new ArrayList();
        Scanner input = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Bootcamp java = new Bootcamp("Java", LocalDate.of(2020, Month.MARCH, 03), LocalDate.of(2020, Month.JUNE, 05));
        listOfBootcamps.add(java);
        Bootcamp cSharp = new Bootcamp("C#", LocalDate.of(2020, Month.MARCH, 03), LocalDate.of(2020, Month.JUNE, 05));
        listOfBootcamps.add(cSharp);
        Bootcamp javascript = new Bootcamp("Javascript", LocalDate.of(2020, Month.APRIL, 20), LocalDate.of(2020, Month.JULY, 25));
        listOfBootcamps.add(javascript);
        boolean flag = false;
        System.out.println("Please enter a date to check if there are avaliable Bootcamps");

        boolean flag2 = false;
        String date = input.next();
        while(flag2==false) {
            try {
                LocalDate hmerominia = LocalDate.parse(date, formatter2);
                // hmerominia = LocalDate.parse(hmerominia);
                if (hmerominia.isBefore(javascript.getEndingDate()) && hmerominia.isAfter(javascript.getStartingDate())) {
                    flag = true;
                    printingWhenBootcampIsAvailiable(hmerominia, "Javascript", javascript.getStartingDate(), javascript.getEndingDate());
                }
                if (hmerominia.isBefore(java.getEndingDate()) && hmerominia.isAfter(java.getStartingDate())) {
                    flag = true;
                    printingWhenBootcampIsAvailiable(hmerominia, "Java", java.getStartingDate(), java.getEndingDate());
                }
                if (hmerominia.isBefore(cSharp.getEndingDate()) && hmerominia.isAfter(cSharp.getStartingDate())) {
                    flag = true;
                    printingWhenBootcampIsAvailiable(hmerominia, "C#", cSharp.getStartingDate(), cSharp.getEndingDate());
                }
                if (!flag) {
                    System.out.println("Sorry no bootcamp avaliable in " + hmerominia.format(formatter));
                }
                flag2 = true;
            } 
            catch (DateTimeParseException error) {
                System.out.println("Give a date in the format dd/MM/yyyy");
                date = input.next();
            }
        } 
    }

    public static void printingWhenBootcampIsAvailiable(LocalDate hmerominia, String language, LocalDate getStartingDate, LocalDate getEndingDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        System.out.println("Bootcamp " + language + " will be avaliable in " + hmerominia.format(formatter) + ". It starts " + getStartingDate.format(formatter) + " and ends " + getEndingDate.format(formatter));
    }

}
