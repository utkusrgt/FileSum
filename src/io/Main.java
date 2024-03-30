package io;

import java.io.BufferedReader;
import java.io.FileReader;


public class Main {
    public static void main(String[] args) {


        try {
            FileReader file = new FileReader("patika.txt");
            BufferedReader input = new BufferedReader(file);
            int toplam = 0;
            String line;
            while ((line = input.readLine()) != null) {
                System.out.println(line);
                int num = Integer.parseInt(line);
                toplam += num;


            }
            input.close();
            System.out.println(toplam);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());;
        }
    }
}