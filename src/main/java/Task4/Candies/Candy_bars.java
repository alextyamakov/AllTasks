package Task4.Candies;


public class Candy_bars extends All_kinds{
    public String size;

    public Candy_bars(String name, double weight, double price, String size) {
        super(name, weight, price);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Candy_bars {" + super.toString() + ", size='" + size + '}';
    }
}

