package WorkingWithAbstraction.exercise.cardRank;

public enum cardRank {
    ACE(0),
    TWO(1),
    THREE(2),
    FOUR(3),
    FIVE(4),
    SIX(5),
    SEVEN(6),
    EIGHT(7),
    NINE(8),
    TEN(9),
    JACK(10),
    QUEEN(11),
    KING(12);

    private int value;

    cardRank(int value){
        this.value=value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Ordinal value: " + value + "; Name value: ";
    }

    public static void printAll() {
        System.out.println("Card Ranks:");
        for (cardRank value : cardRank.values()) {
            System.out.println(value + value.name());
        }
    }
}
