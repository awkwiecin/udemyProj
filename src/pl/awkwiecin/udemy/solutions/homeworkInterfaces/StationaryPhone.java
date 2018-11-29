package pl.awkwiecin.udemy.solutions.homeworkInterfaces;

public class StationaryPhone implements Phone {
    @Override
    public void call() {
        System.out.println("beeeep... beeeep...");
    }

    @Override
    public int enterNumber(int number) {
        System.out.println("Entered number is: 22 " + number);
        return number;
    }

    @Override
    public void answer() {
        System.out.println("Halo, halo!!!");
    }
}
