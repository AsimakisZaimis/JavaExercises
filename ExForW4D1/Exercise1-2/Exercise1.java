
package exercise1;

import java.util.ArrayList;


public class Exercise1 {

   
    public static void main(String[] args) {
        ArrayList<Phone> phones= new ArrayList();
        Phone an1 = new Android("Samsung", 24.99);
        Phone nonAn1 = new NonAndroid("Apple", 37.99);
        Phone an2 = new Android("Sony", 24.99);
        Phone nonAn2 = new NonAndroid("Nokia", 37.99);
        Phone an3 = new Android("Huawei", 24.99);
        Phone nonAn3 = new NonAndroid("", 37.99);
        Phone an4 = new Android("LG", 24.99);
        Phone nonAn4 = new NonAndroid("Nokia", 37.99);
        Phone an5 = new Android("Xiaomi", 24.99);
        Phone nonAn5 = new NonAndroid("Apple", 37.99);
        
        phones.add(an1);
        phones.add(nonAn1);
        phones.add(an2);
        phones.add(nonAn2);
        phones.add(an3);
        phones.add(nonAn3);
        phones.add(an4);
        phones.add(nonAn4);
        phones.add(an5);
        phones.add(nonAn5);
        
        for(Phone ph : phones){
            System.out.println("The price of "+ph.getBrand()+" is "+ph.getPrice());
            
        }
                
        

    }
    
}
