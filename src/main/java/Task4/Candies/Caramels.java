package Task4.Candies;


public class Caramels extends All_kinds{
    public int calorie;

    public Caramels(String name, double weight, double price, int calorie) {
        super(name, weight, price);
        this.calorie = calorie;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    @Override
    public String toString() {
        return "Caramels {" + super.toString() + ", calorie=" + calorie + '}';
    }
}

