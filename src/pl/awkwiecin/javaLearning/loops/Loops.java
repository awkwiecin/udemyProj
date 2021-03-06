package pl.awkwiecin.javaLearning.loops;

public class Loops {
    public static void main(String[] args) {

        for (int i = 0; i < 30; i++) { //for (int i = 1; i <= 30; i++)
            System.out.println("nr# " + i);
        }

        int l = 20;
        for (; l > 10; l--) {
            System.out.println(l);
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " - ");
            for (int j = 0; j < 10; j++) {
                System.out.print(j + ", ");
            }
            System.out.println("");
        }

        int[] ints = {4, 3, 65, 123, 2, 90, 15};
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
        //----foreach-----//
        for (int i : ints) {
            System.out.println(i);
        }


        int z = 200;
        while (z % 3 != 0) {
            z--;
            System.out.println(z);
        }
        //-------do while----------//
        do {
            System.out.println(false);
        }
        while (false);
        //--------LABELS-------------//
        LABEL:
        for (int i = 0; i < 10; i++) {
            System.out.println("i= " + i);

            for (int j = 0; j < 100; j++) {
                System.out.println("j= " + j);
                break LABEL;
            }

        }
    }
}
