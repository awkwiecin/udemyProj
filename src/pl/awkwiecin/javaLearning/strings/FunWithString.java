package pl.awkwiecin.javaLearning.strings;

import pl.awkwiecin.javaLearning.classAndObject.Invoice;
import pl.awkwiecin.javaLearning.utils.StrUtils;

public class FunWithString {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("korki", 100, 5, "0002883839292", null);

        System.out.println(invoice.toString());
        System.out.println(invoice);

        String text = "a".concat("b");
        String text2 = "a" + "b";
        System.out.println(text);
        System.out.println(text2);

        if (text.equals(text2)) {
            System.out.println("equals");
        }

        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());

        String s = "a,b,c,d,e";
        String[] strings = s.split(",");

        System.out.println(strings[2]);

        String result = "";
        for (String str : strings) {

            result = result + str + ", ";

        }
        System.out.println(StrUtils.removeLastSeparator(result, ","));

        StringBuilder sb = new StringBuilder();

        String res = "";

        for (int i = 0; i < 1000000; i++) {
            sb.append("a");
        }
        System.out.println(sb.toString());
    }
}
