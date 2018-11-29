package pl.awkwiecin.udemy.polymorphism;

import pl.awkwiecin.udemy.interfaces.Document;

public class Box<T extends Document> {

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
