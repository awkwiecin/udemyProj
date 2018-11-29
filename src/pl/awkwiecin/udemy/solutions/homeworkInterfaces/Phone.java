package pl.awkwiecin.udemy.solutions.homeworkInterfaces;

public interface Phone {
    public void call();
    public int enterNumber(int number);
    public void answer();

    public default void introduceYourself() {
        System.out.println("interface Phone");
    }
}
