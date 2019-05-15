package pl.awkwiecin.javaLearning.solutions.homeworkPolymorphism;

class MultipleParameterGeneric<T1, T2> {
    private T1 t1;
    private T2 t2;

    void setT1T2(T1 t1, T2 t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    T1 getT1() {
        return t1;
    }

    public T2 getT2() {
        return t2;
    }

}
