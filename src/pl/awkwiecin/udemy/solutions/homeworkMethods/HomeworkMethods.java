package pl.awkwiecin.udemy.solutions.homeworkMethods;

public class HomeworkMethods {
    public static void main(String[] args) {
        System.out.println(isPrime(81));
    }

    private static boolean isPrime(int a) {
        boolean result = true;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                result = false;
            }
        }
        return result;
    }
}
