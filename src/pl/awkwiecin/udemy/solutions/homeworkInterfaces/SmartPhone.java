package pl.awkwiecin.udemy.solutions.homeworkInterfaces;

public class SmartPhone implements Phone {
    @Override
    public void call() {
        System.out.println("Calling...");
    }

    @Override
    public int enterNumber(int number) {
        System.out.println("Number entered on screen is: " + number);
        return number;
    }

    @Override
    public void answer() {
        System.out.println("Helloo....");
    }
}
