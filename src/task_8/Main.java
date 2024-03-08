package task_8;

public class Main {
    public static void main(String[] args) {
        int dayOfWeek = 4;
        String schedule = "";

        switch (dayOfWeek) {

            case 1:
                schedule = "Gym in the morning";
                break;
            case 2:
                schedule = "Class after work";
                break;
            case 3:
                schedule = "Meetings all day";
                break;
            case 4:
                schedule = "Work  for home";
                break;
            case 5:
                schedule = "Game night after work";
                break;
            case 6:
                schedule = "Free";
                break;
            case 7:
                schedule = "Free";
                break;
            default:
                System.out.println("value out of range");
        }
        System.out.println(schedule);
    }
}
