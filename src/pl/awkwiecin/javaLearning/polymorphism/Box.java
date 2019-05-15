package pl.awkwiecin.javaLearning.polymorphism;

import pl.awkwiecin.javaLearning.interfaces.Document;

public class Box<T extends Document> {

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
