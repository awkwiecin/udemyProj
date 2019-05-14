package pl.awkwiecin.javaLearning.interfaces;

public class DrawDocument implements Document {
    @Override
    public boolean save() {
        //dodatkowe operacje
        System.out.println("Save Draw Doc.");
        return true;
    }

    @Override
    public String open(String path) {
        //dodatkowe operacje
        return "draw file: " + path;
    }


    public void draw(OnClickListener ocl) {
        System.out.println("draw...");
    }
}
