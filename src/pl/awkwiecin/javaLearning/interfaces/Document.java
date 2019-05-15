package pl.awkwiecin.javaLearning.interfaces;

public interface Document /*extends OnClickListener*/ {

    public String d = "d";


    public boolean save();

    public String open(String path);

    public default void introduceYourself() {   //default methods - use for information ad interface
        System.out.println("interface Document");
    }
}
