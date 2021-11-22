package ru.mirea.TEST;

public enum Size {
    SMALL(10),
    MEDIUM(50),
    BIG(100);
    private final int value;

    Size(int size) {
        this.value = size;
    }

    public int getValue() {
        return value;
    }
}
