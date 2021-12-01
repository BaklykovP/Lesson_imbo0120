package ru.mirea.exercise25_26;

public class MetroLine {
    String nameLine;
    String numberLine;

    public MetroLine(String nameLine, String numberLine) {
        this.nameLine = nameLine;
        this.numberLine = numberLine;
    }

    @Override
    public String toString() {
        return "MetroLine{" +
                "nameLine='" + nameLine + '\'' +
                ", numberLine='" + numberLine + '\'' +
                '}';
    }
}
