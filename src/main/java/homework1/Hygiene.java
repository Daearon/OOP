package homework1;

public class Hygiene extends Product {
    private final int size;

    protected Hygiene(String name, Double cost, int quantity, String measure, int size) {
        super(name, cost, quantity, measure);
        this.size = size;
    }
    public int getSize() {
        return size;
    }
}
