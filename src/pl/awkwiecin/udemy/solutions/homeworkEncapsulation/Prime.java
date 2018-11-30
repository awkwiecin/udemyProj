package pl.awkwiecin.udemy.solutions.homeworkEncapsulation;

public class Prime {

    public void listOfPrime(int x, int y) {
        for (int i = x; i < y; i++) {
            if (checkPrime(i)) {
                System.out.print(i);
                System.out.print(" ");
            }
        }
    }

    private boolean checkPrime(int x) {
        boolean prime = true;
        if (x % 2 == 0 && x != 2) {
            prime = false;
        } else if (x % 3 == 0 && x != 3) {
            prime = false;
        } else if (x % 5 == 0 && x != 5) {
            prime = false;
        } else if (x % 7 == 0 && x != 7) {
            prime = false;
        } else if (x % 11 == 0 && x != 11) {
            prime = false;
        }
        return prime;
    }
}
