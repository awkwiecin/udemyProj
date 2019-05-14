package pl.awkwiecin.javaLearning.interfaces;

public class DocumentTest {
    public static void main(String[] args) {
        TxtDocument txt = new TxtDocument();
        DrawDocument draw = new DrawDocument();

        System.out.println(txt.open("txtPath"));
        System.out.println(draw.save());
        draw.introduceYourself();

        Document calc = new Document() {
            @Override
            public boolean save() {
                return false;
            }

            @Override
            public String open(String path) {
                return null;
            }
        };

        draw.draw(() -> { //wyrazenie lambda, nie tworzymy interfejsu
            System.out.println("onClick"); // nie wydrukuje się bo przekazujemy obiekt, z którym potem nic nie robimy
        });

    }
}



