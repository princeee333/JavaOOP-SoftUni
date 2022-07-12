package WorkingWithAbstraction.exercise.CardSuit;

public enum cardSuit {
    CLUBS(0),
    DIAMONDS(1),
    HEARTS(2),
    SPADES(3);

    private int value;

    cardSuit(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Ordinal value: " + value + "; Name value: ";
    }

    public static void printAll() {
        System.out.println("Card Suits:");
        for (cardSuit value : cardSuit.values()) {
            System.out.println(value + value.name());
        }
    }
}
