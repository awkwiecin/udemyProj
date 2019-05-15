package pl.awkwiecin.javaLearning.solutions.homeworkPolymorphism;

public class MultipleGenericTest {
    public static void main(String[] args) {
        MultipleParameterGeneric<Integer, String> mgt = new MultipleParameterGeneric<Integer, String>();
        mgt.setT1T2(Integer.valueOf(100), "Hello");
        System.out.println(mgt.getT1());
        System.out.println(mgt.getT2());

        MultipleParameterGeneric<String, Integer> mgt2 = new MultipleParameterGeneric<String, Integer>();
        mgt2.setT1T2("Ala ma kota", Integer.valueOf(72));
        System.out.println(mgt2.getT1());
        System.out.println(mgt2.getT2());

    }

}
