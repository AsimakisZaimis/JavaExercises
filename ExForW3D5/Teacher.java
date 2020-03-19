
package playingwithemployees;


public class Teacher extends Employee implements Advisable{

    public Teacher(String name, double salary) {
        super(name, salary);
    }
    public void teach(){
        System.out.println("Teacher is teaching");
    }
    
    @Override
    public void giveAdvice(){
        System.out.println(getName()+" Teacher  is giving advice!");
    }
    
    @Override
    public void work(){
        System.out.println(name+" works like a teacher");
    }
    
}
