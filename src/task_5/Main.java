package task_5;

public class Main {
    public static void main(String[] args) {
        int time = 21;
        String timeOfDay = "";
        if (time >= 5 && time < 12) {
            timeOfDay = "morning";
        } else if (time >= 12 && time < 20) {
            timeOfDay = "daytime";
        } else
            timeOfDay = "night";
        System.out.println(timeOfDay);
    }

}
//Załóżmy, że masz dostęp do podwójnej zmiennej zwanej czasem. Napisz kod, który przypisuje inny
//wartość na zmienną łańcuchową timeOfDay w oparciu o wartość czasu w godzinach. Jeśli jest czas
//pomiędzy 5 a 12, włączając 5, ale nie włączając 12, ustaw timeOfDay na „rano”. Jeśli jest czas
//pomiędzy 12 a 20, włączając 12, ale nie włączając 20, ustaw timeOfDay na „dzień”. Wreszcie,
//jeśli zmienna czasu nie spełnia żadnego z warunków, ustaw timeOfDay na „noc”.