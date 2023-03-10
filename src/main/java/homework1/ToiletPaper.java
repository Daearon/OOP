package homework1;

public class ToiletPaper extends Hygiene {
    private final int layers;

    protected ToiletPaper(String name, Double cost, int quantity, String measure, int size, int layers) {
        super(name, cost, quantity, measure, size);
        this.layers = layers;
    }

    @Override
    public String toString() {
        return String.format(
                "Название: %s; Стоимость: %f; Количество: %d; Единица измерения: %s; " +
                        "Количество в упаковке: %d; Количество слоев: %d",
                super.getName(), super.getCost(), super.getQuantity(), super.getMeasure(), super.getSize(), this.layers);
    }
}
