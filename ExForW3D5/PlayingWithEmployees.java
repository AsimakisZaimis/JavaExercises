
package playingwithemployees;

import java.util.ArrayList;


public class PlayingWithEmployees {

    public static void main(String[] args) {
        ArrayList <Employee> employees = new ArrayList();
        ArrayList <Employee> drivers = new ArrayList();
        ArrayList<Employee> advisors = new ArrayList();
       
        Employee teacher1 = new Teacher("nikos", 800);
        Employee teacher2 = new Teacher("giorgos",1000 );
        Employee receptionis1 = new Receptionist("babis", 1500);
        Employee director1 = new Director("takis", 2000);
        Employee director2 = new Director("Kwstas", 2500);
        
        
        employees.add(teacher1);
        employees.add(teacher2);
        employees.add(receptionis1);
        employees.add(director1);
        employees.add(director2);
        
        
        teacher1.work();
        teacher2.work();
        receptionis1.work();
        director1.work();
        director2.work();
        
        for(Employee emp:employees){
            if(emp instanceof Advisable && emp instanceof Driving){
                advisors.add(emp);
                drivers.add(emp);
            }
            else if(emp instanceof Advisable){
                advisors.add(emp);
            } 
            else if(emp instanceof Driving){
                drivers.add(emp);
            }
        }
        
        for(Employee emp:drivers){
            System.out.println(emp.getName()+" is capable of driving");
        }
        for(Employee emp: advisors){
            System.out.println(emp.getName()+" is capable of advice");
        }
        
    }
    
}
