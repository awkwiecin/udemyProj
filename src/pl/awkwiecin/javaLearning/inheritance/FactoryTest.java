package pl.awkwiecin.javaLearning.inheritance;

public class FactoryTest {
    public static void main(String[] args) {

        CarFactory carFactory = new CarFactory();
        PhoneFactory phoneFactory = new PhoneFactory();

        carFactory.testDrive();
        carFactory.checkState();
        carFactory.produce();

        phoneFactory.testCall();
        phoneFactory.checkState();
        phoneFactory.produce();

//        Factory factory = new Factory() {
//            @Override
//            public void produce() {
//                super.produce();
//            }
//
//            @Override
//            public void checkState() {
//                super.checkState();
//            }
//        };
        phoneFactory.destroy();
        carFactory.destroy();
        carFactory.checkState();
        phoneFactory.checkState();
        System.out.println(phoneFactory.introduceYourself());

        CarFactory car1 = new CarFactory();
        CarFactory car2 = new CarFactory();
        car1.setName("C");
        car2.setName("C");
        System.out.println(car1.equals(car2));
    }
}
