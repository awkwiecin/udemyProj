package pl.awkwiecin.udemy.variables;

public class Variables {
    public static void main(String[] args) {
        byte b=127;
        byte b1=-128;
        short s = Short.MAX_VALUE;
        int i = Integer.MAX_VALUE;
        System.out.println(i);
        Integer integer = 12;
        int sum = i+1;
        long l = Long.MAX_VALUE; //primitive type
        Long l1=129l; //object type

        float f = Float.MAX_VALUE;
        float f1 = 1.1f;
        double d = Double.MAX_VALUE;
        double d1 = 0.0;

        char c = 'a';
        String helloHowAreYou = "Hello, how are You?";

        boolean boo = true;
        boolean boo1 = false;

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(l1);
        System.out.println(f);
        System.out.println(d);
        System.out.println(boo);
        System.out.println(helloHowAreYou);
        System.out.println(c);
    }
}
