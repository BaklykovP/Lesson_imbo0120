package ru.mirea.exercise3.practice3_3;

public class Book {
    private String author;
    private String name;
    private int time;

    public Book(String author, String name, int time) {
        this.author = author;
        this.name = name;
        this.time = time;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", time=" + time +
                '}';
    }
}
