package pl.awkwiecin.javaLearning.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class IO {
    public static void main(String[] args) {

        String separator = File.separator;
        File file = new File("C:"+ separator +"Users\\Rincewind\\javaProjects\\Udemy\\udemyProj\\src\\pl\\awkwiecin\\javaLearning\\io\\abc.txt");
        System.out.println(file.exists());

        try {
            List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\Rincewind\\javaProjects\\Udemy\\udemyProj\\src\\pl\\awkwiecin\\javaLearning\\io\\abc.txt"), StandardCharsets.ISO_8859_1);
            for (String str : lines) {
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileWriter writer = new FileWriter("C:\\Users\\Rincewind\\javaProjects\\Udemy\\udemyProj\\src\\pl\\awkwiecin\\javaLearning\\io\\efg.txt", true);
            writer.write("Hello!");
            writer.write("\r\n");
            writer.write("How are You?");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
