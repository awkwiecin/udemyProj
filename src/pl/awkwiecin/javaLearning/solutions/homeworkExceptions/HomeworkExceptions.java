package pl.awkwiecin.javaLearning.solutions.homeworkExceptions;

public class HomeworkExceptions {
    public static void main(String[] args) {
        int x = 12;
        int y = 0;

        try {
            System.out.println(x / y);
            System.exit(0);
        } catch (ArithmeticException ae) {
            System.out.println("catch");
            System.exit(0);
        } finally {
            System.out.println("BUSTED!!!!");
        }
    }
}
