package task_11;

public class Main {
    public static void main(String[] args) {

        System.out.println(rollDice(2));
        System.out.println(rollDice(2));
        System.out.println("---------------");
        System.out.println(rollDice(4));
        System.out.println(rollDice(4));
        System.out.println("---------------");
        System.out.println(rollDice(6));
        System.out.println(rollDice(8));
    }
        public static int rollDice(int sides){
            // random num between 0 and (almost) 1
            double randomNumber=Math.random();

            // change range to 0 to (almost) 6
            randomNumber=randomNumber*sides;

            // shift range up one
            randomNumber=randomNumber+1;

            // cast to integer (ignore decimal part)
            // ex. 6.998 becomes 6
            int randomInt=(int)randomNumber;

            // return statement
            return randomInt;
        }
}
