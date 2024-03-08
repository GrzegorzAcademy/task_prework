package task_13;

public class Main {
    public static void main(String[] args) {

        System.out.println(countBlocks(6));

    }

    public  static int countBlocks(int levels) {
        int total = 0;
        for (int i = 0; i <= levels; i++) {
            total = i*levels;
        }
        return total;
    }
}

