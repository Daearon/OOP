package homework1;

public class Food extends Product {
    private final String date;

    protected Food(String name, Double cost, int quantity, String measure, String date) {
        super(name, cost, quantity, measure);
        this.date = date;
    }
    public String getDate() {
        return this.date;
    }
}
