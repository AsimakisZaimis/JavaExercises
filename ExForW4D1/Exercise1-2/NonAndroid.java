/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

/**
 *
 * @author Asimakis
 */
public class NonAndroid extends Phone{

    public NonAndroid(String brand, double price) {
        super(brand, price=37.99);
    }
    
    @Override 
    public double setPrice(double price){
        return price;
    }
    
}
