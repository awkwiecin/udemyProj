package pl.awkwiecin.udemy.solutions.homeworkSwitch;

public class HomeworkSwitch {
    public static void main(String[] args) {
        int[] homeworkArray = new int[1000];
        for (int i = 0; i < homeworkArray.length; i++) {
            homeworkArray[i] = i;
        }
        for (int i : homeworkArray) {
            if (i%3==0 && i%7==0 && i<987) {
                System.out.print(i);
                System.out.print(", ");

            }
            else  if (i==987){
                System.out.println(i);
            }
        }
    }
}
