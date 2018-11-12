package pl.awkwiecin.udemy.variables;

import java.sql.Struct;

public class Table {

    public static void main(String[] args) {
        int[] ints;
        ints = new  int[3];
        ints[0]=6;
        ints[1] =3;
        ints[2]=765;
        System.out.println(ints[1]);
       // System.out.println(ints[4]);

        String[] strings = {"element", "inny element"};
        System.out.println(strings[1]);
    }
}
