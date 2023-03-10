package homework1;

public class Masks extends Hygiene {

    protected Masks(String name, Double cost, int quantity, String measure, int size) {
        super(name, cost, quantity, measure, size);
    }

    @Override
    public String toString() {
        return String.format("Название: %s; Стоимость: %f; Количество: %d; Единица измерения: %s; Количество в упаковке: %d",
                super.getName(), super.getCost(), super.getQuantity(), super.getMeasure(), super.getSize());
    }
}
