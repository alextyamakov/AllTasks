package Task4.Candies;


public class Bubble_gum extends All_kinds{
    public String colour;

    public Bubble_gum(String name, double weight, double price, String colour) {
        super(name, weight, price);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Bubble_gum {" + super.toString() + ", colour='" + colour + '}';
    }
}

