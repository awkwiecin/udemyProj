package pl.awkwiecin.udemy.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exc {
    public static void main(String[] args) {
        int x = 4;
        int y = 0;

//        if(y==0) {
//
//        }

        try {
            System.out.println((x / y));
        } catch (/*Exeption*/ArithmeticException e) { //najbardziej szczególny wyjątek
            System.err.println("divide by ZERO error " + e.getMessage());
        } catch (Exception e1) {                //najbardziej ogólny wyjątek
            System.err.println("unknown error");
        } finally {
            System.out.println("finally");
        }
//-------------------try
        BufferedReader fileReader = null;
        try {
            fileReader = new BufferedReader(new FileReader(""));
            fileReader.readLine();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
//--------------------try with resources
        try (BufferedReader fr = new BufferedReader(new FileReader(""))) { //arguments make possible not to use finally to close objects
            fileReader.readLine();

        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        Exc2 exc2 = new Exc2();
        try {
            exc2.sth();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
