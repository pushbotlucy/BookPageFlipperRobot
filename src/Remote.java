import java.util.Scanner;

public class Remote {

    // Simulated servo position (0.0 = rest, 1.0 = flipped)
    private static double servoPosition = 0.0;

    // Flip speed (milliseconds between motion updates)
    private static final int FLIP_DELAY = 1000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("📖 Page Flipper Robot Simulation");
        System.out.println("Press ENTER to flip a page or type 'exit' to quit.");

        while (true) {
            System.out.print("\nCommand: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("👋 Shutting down. Goodbye!");
                break;
            }

            flipPage();
        }
        scanner.close();
    }

    private static void flipPage() {

        moveServo(1.0);
        waitMs(FLIP_DELAY);


        moveServo(0.0);
        waitMs(FLIP_DELAY);


    }

    private static void moveServo(double position) {
        servoPosition = position;

    }

    private static void waitMs(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
