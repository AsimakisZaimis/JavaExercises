
package exercise1;


public abstract class Phone {
    private String brand;
    protected double price;

    public Phone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        
        return brand;
    }

    public double getPrice() {
        return price;
    }
    
    public abstract double setPrice(double price);
    
    
}
