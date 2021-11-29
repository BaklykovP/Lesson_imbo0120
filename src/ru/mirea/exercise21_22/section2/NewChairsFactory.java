package ru.mirea.exercise21_22.section2;

public class NewChairsFactory implements ChairsFactory {
    @Override
    public Chair createMagicChair() {
        return new MagicChair();
    }

    @Override
    public Chair creatMultifunctionalChair() {
        return new MultifunctionalChair();
    }

    @Override
    public Chair creatVictorianChair() {
        return new VictorianChair();
    }
}
