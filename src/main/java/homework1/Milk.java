package homework1;

public class Milk extends Food {
    private final int fatContent;

    protected Milk(String name, Double cost, int quantity, String measure, String date, int fatContent) {
        super(name, cost, quantity, measure, date);
        this.fatContent = fatContent;
    }

    @Override
    public String toString() {
        return String.format(
                "Название: %s; Стоимость: %f; Количество: %d; Единица измерения: %s; Срок годности: %s; Процент жирности: %d;",
                super.getName(), super.getCost(), super.getQuantity(), super.getMeasure(), super.getDate(), this.fatContent);
    }
}
