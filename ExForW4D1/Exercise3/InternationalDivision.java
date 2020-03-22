/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3;

/**
 *
 * @author Asimakis
 */
public class InternationalDivision extends Division{
    private String country;
    private String language;

    public InternationalDivision(String country, String language, String name, int accountNumber) {
        super(name, accountNumber);
        this.country = country;
        this.language = language;
    }
    
    
    @Override
    public void display(){
        System.out.println("The name of the company is "+super.getName()+" and it has accountNumber:"+super.getAccountNumber()+"."
                + "\nIt is located in:"+this.country+". The native language there is:"+this.language);
        
                
    } 

    public String getCountry() {
        return country;
    }

    public String getLanguage() {
        return language;
    }
    
    
}
