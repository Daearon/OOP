package homework1;

public class Drink extends Product {
    private final int volume;

    protected Drink(String name, Double cost, int quantity, String measure, int volume) {
        super(name, cost, quantity, measure);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }
}
