package ru.mirea.exercise8;

public class Table extends Furniture{
    int height;
    int width;

    public Table(String style, String type, int height, int width, int price) {
        super(style, type, price);
        this.height = height;
        this.width = width;
    }

    public void getInfoOfTable(){
        System.out.println("Table is " + style);
    }
}
