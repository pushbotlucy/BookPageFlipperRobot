import java.util.Scanner;
public class Remote2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {

                break;
            }

            flipPage();
        }
        scanner.close();
    }

    private static void flipPage() {

        moveServo(1.0);
        waitMs(Remote.FLIP_DELAY);


        moveServo(0.0);
        waitMs(Remote.FLIP_DELAY);


    }

    private static void moveServo(double position) {
        double servoPosition = position;

    }

    private static void waitMs(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}





