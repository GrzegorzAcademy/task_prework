package task_6;

public class Main {
    public static void main(String[] args) {
        int weekday = 4;
        boolean holiday = true;

        if (holiday||weekday<=6&&weekday>=7){
            System.out.println("sleep on");
        }else {
            System.out.println("Wake Up at 7:00");
        }

    }
}
