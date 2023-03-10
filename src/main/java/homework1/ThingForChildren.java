package homework1;

public class ThingForChildren extends Product {
    private final int minAge;
    private final String hypoallergenic;

    protected ThingForChildren(String name, Double cost, int quantity, String measure, int minAge, String hypoallergenic) {
        super(name, cost, quantity, measure);
        this.minAge = minAge;
        this.hypoallergenic = hypoallergenic;
    }

    public int getMinAge() {
        return minAge;
    }

    public String getHypoallergenic() {
        return hypoallergenic;
    }
}