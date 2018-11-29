package pl.awkwiecin.udemy.inheritance;

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
    }
}
