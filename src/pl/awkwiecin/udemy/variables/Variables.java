package pl.awkwiecin.udemy.variables;

public class Variables {
    public static void main(String[] args) {
        System.out.println("-- Variables --");
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
        //---------------------------------------------------------------------------//
        System.out.println("-- Using variables --");
        System.out.println("Sum: "+b+b1); //brackets matter
        System.out.println("Sum: "+(b+b1));

        int x=1+2;
        int x1 = x+b;
        int y = b-b1;
        int xx=y*y;
        int yy = x1/x;
        double dd = x1/x;
        double dx = 3.0;
        double dy = 7;
        double dz = dy/dx;
        int r = x1%x;
        System.out.println(x1);
        System.out.println(yy);
        System.out.println(dd);
        System.out.println(dz);
        System.out.println(r);
        //---------------------------------------------------------------------------//
        System.out.println("-- incrementation/decrementation --");
        int i1=10;
        int i2=20;
        int i3=30;
        int i4=40;
        System.out.println(i1++);
        System.out.println(i1);
        System.out.println(++i2);
        System.out.println(i3--);
        System.out.println(i3);
        System.out.println(--i4);
        x +=5;  // x=x+5;
        x -=5;  // x=x+5;
        x *=5;  // x=x+5;
        x /=5;  // x=x+5;
        x %=5;  // x %=5;
        System.out.println(x);
        //---------------------------------------------------------------------------//

        System.out.println("-- constants --");

        final int Z_Z = 13;
        int z1;
        z1=8;
        System.out.println(Z_Z);
    }
}
