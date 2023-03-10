package homework1;

public class Egg extends Food {
    private final int packages;

    protected Egg(String name, Double cost, int quantity, String measure, String date, int packages) {
        super(name, cost, quantity, measure, date);
        this.packages = packages;
    }

    @Override
    public String toString() {
        return String.format(
                "Название: %s; Стоимость: %f; Количество: %d; Единица измерения: %s;" +
                        "Срок годности: %s; Количество в упаковке: %d;",
                super.getName(), super.getCost(), super.getQuantity(), super.getMeasure(), super.getDate(), this.packages);
    }
}
