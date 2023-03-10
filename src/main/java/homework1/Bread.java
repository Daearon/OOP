package homework1;

public class Bread extends Food {
    private final String type;

    protected Bread(String name, Double price, int quantity, String measure, String date, String type) {
        super(name, price, quantity, measure, date);
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format(
                "Название: %s; Стоимость: %f; Количество: %d; Единица измерения: %s; Срок годности: %s; Тип муки: %s;",
                super.getName(), super.getCost(), super.getQuantity(), super.getMeasure(), super.getDate(), this.type);
    }
}
