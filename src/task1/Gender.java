package task1;

public enum Gender {
    NOT_SPECIFIED(0),
    MALE(1),
    FEMALE(2);

    private final int value;

    Gender(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static Gender fromValue(int value) {
        for (Gender gender : Gender.values()) {
            if (gender.getValue() == value) {
                return gender;
            }
        }
        throw new IllegalArgumentException("Invalid value: " + value);
    }
}