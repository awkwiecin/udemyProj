package pl.awkwiecin.udemy.solutions.homeworkIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class HomeworkIO {
    public static void main(String[] args) {
        List<Integer > numbers = new ArrayList<>();
        try (BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                String line = bfr.readLine();
                if (line.equals("+")) {
                    writeAll(numbers);
                    System.exit(0);
                } else if(line.equals("*")) {
                    writeAll(numbers);
                    System.exit(0);
                }else if (Integer.parseInt(line)>Integer.MAX_VALUE){
                    throw new IllegalArgumentException();
                }
                else {
                        int intBuffer = Integer.valueOf(line);
                        numbers.add(intBuffer);
                }
            }
        } catch (IOException e){
            System.err.println("error: IO fault!!");
        } catch (NumberFormatException e1) {
            System.err.println("error: Invalid number format!!");
        } catch (IllegalArgumentException e2) {
            System.err.println("error : Number bigger than max int!!");
        }
    }

    private static void writeAll(List<Integer > numbers) {
        for (Integer i : numbers) {
            System.out.print(i);
        }
    }
}
