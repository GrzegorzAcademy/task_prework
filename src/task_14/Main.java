package task_14;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        String[] names = {"Adam", "Karol", "Monika", "Grzegorz", "Karolinka"};
        findLongestName(names);
        System.out.println(findLongestName(names));
    }

    static String findLongestName(String[] names) {
        int lenght = names.length;
        String longestName = names[0];
        for (int i = 0; i < names.length; i++) {
            if (longestName.length() < names[i].length()) {
                longestName = names[i];
            }
        }
        return longestName;
    }
}
