package ru.mirea.exercise25_26;

public class MetroStation {
    String nameStation;
    String numberLine;

    public MetroStation(String nameStation, String numberLine) {
        this.nameStation = nameStation;
        this.numberLine = numberLine;
    }

    public String getNameStation() {
        return nameStation;
    }

    public String getNumberLine() {
        return numberLine;
    }

    @Override
    public String toString() {
        return "MetroStation{" +
                "nameStation='" + nameStation + '\'' +
                ", numberLine='" + numberLine + '\'' +
                '}';
    }
}
