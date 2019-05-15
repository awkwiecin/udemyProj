package pl.awkwiecin.javaLearning.strings;

public class StringJava11 {
    public static void main(String[] args) {

        var text = "text text";
        System.out.println(text.repeat(5)); // repeats text 5 times
        System.out.println(text.repeat(5)); // returns an empty string
        System.out.println("                ".isBlank()); //true - no data
        System.out.println("                    ".isBlank());   //true - no data
        System.out.println("   text     text ".strip()); // removes white signs
        System.out.println("   text     text ".stripLeading()); // removes white signs from beginning
        System.out.println("   text     text ".stripTrailing()); // removes white signs from end
        System.out.println("on\noff\n1\n0\n".lines()); //returs a collection of elements
        System.out.println("on\noff\n1\n0\n".lines().count()); //returs a collection of elements and number of elements in this collection

    }
}
