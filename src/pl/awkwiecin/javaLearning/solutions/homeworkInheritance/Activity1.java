package pl.awkwiecin.javaLearning.solutions.homeworkInheritance;

public class Activity1 extends Activity {

    @Override
    public void onCreate() {
        System.out.println("onCreate Activity1");
    }

    @Override
    public void onStop() {
        System.out.println("Activity1");
        super.onStop();
    }

    void makeSound() {
        System.out.println("RingRing....");
    }
}
