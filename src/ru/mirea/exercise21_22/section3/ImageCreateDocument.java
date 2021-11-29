package ru.mirea.exercise21_22.section3;

public class ImageCreateDocument implements ICreateDocument {
    @Override
    public IDocument createNew() {
        return new ImageDocument();
    }

    @Override
    public IDocument createOpen() {
        return new ImageDocument();
    }

}
