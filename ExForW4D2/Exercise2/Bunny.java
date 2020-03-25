package exercise2;

public class Bunny {

    private int bunnyNumber;

    public Bunny(int bunnyNumber) {
        this.bunnyNumber = bunnyNumber;
    }

    public void hop() {
        System.out.println("Its hopping, its gerbil number:" + this.bunnyNumber);
    }

    @Override
    public String toString() {
        return "bunnyNumber:" + bunnyNumber ;
    }

    public int getBunnyNumber() {
        return bunnyNumber;
    }
    
    
}
