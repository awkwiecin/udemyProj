package pl.awkwiecin.udemy.polymorphism;

import pl.awkwiecin.udemy.classAndObject.Invoice;
import pl.awkwiecin.udemy.interfaces.Document;
import pl.awkwiecin.udemy.interfaces.DrawDocument;
import pl.awkwiecin.udemy.interfaces.TxtDocument;

public class Poly {
    public static void main(String[] args) {

        Document draw = new DrawDocument();
        if (draw instanceof DrawDocument) {
            System.out.println(true);
        }
        if (draw instanceof TxtDocument) {
            System.out.println(false);
        }

        Box<Document> box = new Box<>();
        box.setT(new TxtDocument());
        box.setT(new DrawDocument());
        //box.setT(""); no can do, gdyz albowiem string nie jest typu Document

//        Box<String> b2 = new Box<>();
//        b2.setT("");

        String n = "1";
        Object o = "abc";
        String s=(String) o;
        int i = Integer.valueOf(n);
        System.out.println(s+n);
        System.out.println(""+i);
    }
}
