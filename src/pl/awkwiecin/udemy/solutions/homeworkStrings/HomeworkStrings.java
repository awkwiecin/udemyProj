package pl.awkwiecin.udemy.solutions.homeworkStrings;

public class HomeworkStrings {
    public static void main(String[] args) {
        String text = "ala ma kota";
        String encodedText = encode(text);
        System.out.println("encoded TEXT: " +encodedText);
        String decodedText = decode(encodedText);
        System.out.println("decoded TEXT: " + decodedText);

    }

    private static String decode(String textToDecode) {
        String decod0Sub1 = textToDecode.substring(0, textToDecode.length() / 2 + 1);
        String decod0Sub2 = textToDecode.substring(textToDecode.length() / 2 + 1, textToDecode.length());
        //System.out.println("dsub1: " + decod0Sub1);
        //System.out.println("dsub2: " + decod0Sub2);
        String decod1 = decod0Sub2.concat(decod0Sub1);
        //System.out.println("decoded: " + decod1);
        String decod2 = decod1.replace("Y12", "I");
        String decod3 = decod2.replace("20", "U");
        String decod4 = decod3.replace("X39", "O");
        String decod5 = decod4.replace("C19", "A");
        String decod6 = decod5.replace("X!X!", " ");
        String decod7 = decod6.toLowerCase();
        return decod7;
    }

    private static String encode(String textToEncode) {
        String encod0 = textToEncode.toUpperCase();
        String encod1 = encod0.replace(" ", "X!X!");
        String encod2 = encod1.replace("A", "C19");
        String encod3 = encod2.replace("O", "X39");
        String encod4 = encod3.replace("U", "20");
        String encod5 = encod4.replace("I", "Y12");
        //System.out.println("before switch  " + encod5);
        String encod5Sub1 = encod5.substring(0, encod3.length() / 2);
        String encod5Sub2 = encod5.substring(encod3.length() / 2, encod3.length());
        //System.out.println("esub1: " +encod5Sub1);
        //System.out.println("esub1: " +encod5Sub2);
        String encod6 = encod5Sub2.concat(encod5Sub1);
        //System.out.println(encod6);
        return encod6;
    }
}
