package pl.awkwiecin.javaLearning.solutions.homeworkCollections;

import java.util.Map;
import java.util.TreeMap;

public class HomeworkCollections {
    public static void main(String[] args) {

        Map<Integer, Integer> pointsTreeMap = new TreeMap<>();

        pointsTreeMap.put(0, 10);
        pointsTreeMap.put(2, 10);
        pointsTreeMap.put(5, 4);
        pointsTreeMap.put(3, 3);
        pointsTreeMap.put(4, 12);
        pointsTreeMap.put(1, 7);

        for (Map.Entry<Integer, Integer> entry : pointsTreeMap.entrySet()) {
            System.out.print("x: " + entry.getKey() + " ");
            System.out.println("y: " + entry.getValue());

        }


    }
}
