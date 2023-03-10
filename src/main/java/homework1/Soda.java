package homework1;

public class Soda extends Drink {

    protected Soda(String name, Double cost, int quantity, String measure, int volume) {
        super(name, cost, quantity, measure, volume);
    }

    @Override
    public String toString() {
        return String.format("Наименование: %s; Стоимость: %f; Количество: %d; Еденица измерения: %s; Объем: %d",
                super.getName(), super.getCost(), super.getQuantity(), super.getMeasure(), super.getVolume());
    }
}
