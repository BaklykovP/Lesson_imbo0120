package ru.mirea.exercise25_26;

import java.util.List;

public class Metro {
    private List<MetroLine> lines;
    private List<MetroStation> stations;

    public Metro(List<MetroLine> lines, List<MetroStation> stations) {
        this.lines = lines;
        this.stations = stations;
    }
}
