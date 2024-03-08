package task_15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("pg98.txt");
        Scanner scanner = new Scanner(file);
        int words = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            words += line.split(" ").length;

        }
        System.out.println(words);
    }
}
