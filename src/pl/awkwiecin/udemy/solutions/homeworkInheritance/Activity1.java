package pl.awkwiecin.udemy.solutions.homeworkInheritance;

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
    public void makeSound() {
        System.out.println("RingRing....");
    }
}
