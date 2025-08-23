package items;

public class HealingPotions extends Items{
    private int amountHealed;

    public HealingPotions(String name, String description, int amountHealed) {
        super(name, description);
        this.amountHealed = amountHealed;
    }

    @Override
    public String toString() {
        return super.toString() +
                " " + amountHealed +" Health points";
    }
}
