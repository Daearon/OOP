package homework1;

public class Pacifier extends ThingForChildren {

    protected Pacifier(String name, Double cost, int quantity, String measure, int minAge, String hypoallergenic) {
        super(name, cost, quantity, measure, minAge, hypoallergenic);
    }

    @Override
    public String toString() {
        return String.format(
                "Название: %s; Стоимость: %f; Количество: %d; Единица измерения: %s; " +
                        "Минимальный возраст: %d; Гипоаллергенность: %s;",
                super.getName(), super.getCost(), super.getQuantity(), super.getMeasure(),
                super.getMinAge(), getHypoallergenic());
    }
}
