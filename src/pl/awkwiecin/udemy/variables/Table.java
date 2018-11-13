package pl.awkwiecin.udemy.variables;

import java.sql.Struct;

public class Table {

    public static void main(String[] args) {
        System.out.println("-- arrays --");
        int[] ints;
        ints = new  int[3];
        ints[0]=6;
        ints[1] =3;
        ints[2]=765;
        System.out.println(ints[1]);
       // System.out.println(ints[4]);

        String[] strings = {"element", "inny element"};
        System.out.println(strings[1]);
//-------------------------------------------------------------------------//s
        System.out.println("-- multidimensional arrays --");
        String[][] strings2 = {{"q", "w", "e"},{"a"},
                {"element", "inny element","element", "inny element","element", "inny element","element", "inny element"}};
        System.out.println(strings2[0][2]);
        System.out.println(strings2[2][2]);

        int [][][] ints3 = new  int[2][3][4];
        ints3 = {{{}}};
    }
}
