package pl.awkwiecin.javaLearning.solutions.homeworkInterfaces;

public class PhoneTest {
    public static void main(String[] args) {
        System.out.println("-- Phone Test --");
        SmartPhone lG = new SmartPhone();
        StationaryPhone tel = new StationaryPhone();

        lG.introduceYourself();
        lG.call();
        System.out.println(tel.enterNumber(6223241));
        System.out.println(lG.enterNumber(572412394));
    }
}
