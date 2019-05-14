package pl.awkwiecin.javaLearning.solutions.homeworkLoops;

public class HomeworkLoops {
    public static void main(String[] args) {
        int [] ints = new int[5];
        for (int i = 0; i <ints.length ; i++) {
            ints[i] = i^2;
        }
        for (int i = 0; i < ints.length ; i++) {
            System.out.print(ints[i] + " ");
        }
        System.out.println("");

        int z=0;
        int sum=0;
        while (z<ints.length) {
            sum=sum+ints[z];
            z++;
        }
        System.out.println(sum);
    }
}
