package task_16.letters;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("movies.txt");

        Scanner scanner = new Scanner(file);
        int countLine = 0;
        String line = "";

        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            countLine += line.split("/n").length;


            System.out.println(line);

        }
        int randomFilm = (int) (Math.random() * countLine) + 1;
        System.out.println(randomFilm);
        System.out.println(line.indexOf(randomFilm));


    }
}



