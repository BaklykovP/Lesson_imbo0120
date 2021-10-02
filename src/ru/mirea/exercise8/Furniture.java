package ru.mirea.exercise8;

public abstract class Furniture {
    String style;
    String type;
    int price;

    public Furniture(String style, String type, int price) {
        this.style = style;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "style='" + style + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }


}
