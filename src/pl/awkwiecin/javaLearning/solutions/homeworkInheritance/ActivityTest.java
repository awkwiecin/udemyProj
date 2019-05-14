package pl.awkwiecin.javaLearning.solutions.homeworkInheritance;

public class ActivityTest {
    public static void main(String[] args) {
        Activity1 a1 = new Activity1();
        a1.makeSound();
        a1.onCreate();
        a1.onStop();
        a1.onPause();
    }
}
