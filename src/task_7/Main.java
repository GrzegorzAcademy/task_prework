package task_7;

public class Main {
    public static void main(String[] args) {
        double playbackPosition = 120;
        boolean rewinding = true;
        if (rewinding) {
            double rewindAmount = 0.1;

            playbackPosition = playbackPosition - rewindAmount;
        }
        System.out.println(playbackPosition);
    }
}