package pl.awkwiecin.javaLearning.interfaces;

import java.io.Serializable;

public class TxtDocument implements Document, Serializable {
    @Override
    public boolean save() {
        String s = d;
        System.out.println("Save Txt Doc.");
        return true;
    }

    @Override
    public String open(String path) {
        return "txt file: " + path;
    }
}
