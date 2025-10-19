package items;

public class HealingPotions extends Items{
    private final int amountHealed;

    public HealingPotions(String name, String description, int amountHealed) {
        super(name, description);
        this.amountHealed = amountHealed;
    }

    public int getAmountHealed() {
        return amountHealed;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void usePotions(){

    }
}
