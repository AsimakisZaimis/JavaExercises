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
public class DomesticDivision extends Division{
    private String state;

    public DomesticDivision(String state, String name, int accountNumber) {
        super(name, accountNumber);
        this.state = state;
    }

    public String getState() {
        return state;
    }
    
    @Override
    public void display(){
         System.out.println("The name of the company is:"+super.getName()+" and it has accountNumber:"+super.getAccountNumber()+". "+
                 "It is located in:"+this.state);
    } 
    
}
