import java.util.Arrays;
import java.util.Scanner;

public class WaitFor {
    private WaitFor() {
    }


    static Scanner scanner = new Scanner(System.in);

    public static String waitForString() {
        // Method to wait for user input
        String value;
        while (true) {
            try {
                value = scanner.nextLine();
                checkForExit(value);
                break;
            } catch (Exception e) {
                System.out.println("Please enter a valid input");
                scanner.nextLine();
            }
        }
        return value;
    }

    public static int waitForInt(int min, int max) {
        // Method to wait for user input
        int value;
        while (true) {
            try {
                value = scanner.nextInt();
                if (value > max || value < min) {
                    System.out.println("Please enter a valid number within the bounds " + min + "-" + max);
                    scanner.nextLine();
                } else {
                    break;
                }
                // break;
            } catch (Exception e) {
                System.out.println("Please enter a valid integer");
                // scanner.nextLine();
                String txt = scanner.nextLine();
                checkForExit(txt);
            }
        }
        return value;
    }

    public static double waitForDouble(double min, double max) {
        // Method to wait for user input
        double value;
        while (true) {
            try {
                value = scanner.nextDouble();
                if (value > max || value < min) {
                    System.out.println("Please enter a valid number within the bounds " + min + "-" + max);
                    scanner.nextLine();
                } else {
                    scanner.nextLine();
                    break;
                }
            } catch (Exception e) {
                System.out.println("Please enter a valid number");
                String txt = scanner.nextLine();
                checkForExit(txt);
            }
        }
        return value;
    }

    public static boolean waitForYesNo() {
        // Method to wait for user input
        boolean value;
        while (true) {
            try {
                String txt = scanner.nextLine();
                checkForExit(txt);
                if (txt.equalsIgnoreCase("yes") || txt.equalsIgnoreCase("y")) {
                    value = true;
                    break;
                } else if (txt.equalsIgnoreCase("no") || txt.equalsIgnoreCase("n")) {
                    value = false;
                    break;
                } else {
                    System.out.println("Please enter a valid input");
                }
            } catch (Exception e) {
                System.out.println("Please enter a valid input");
                String txt = scanner.nextLine();
                checkForExit(txt);
            }
        }
        return value;
    }

    public static boolean waitForBoolean() {
        // Method to wait for user input
        boolean value;
        while (true) {
            try {
                value = scanner.nextBoolean();
                break;
            } catch (Exception e) {
                System.out.println("Please enter a valid boolean (true/false)");
                String txt = scanner.nextLine();
                checkForExit(txt);
            }
        }
        return value;
    }

    public static void waitForInteraction(){
        //Method to wait for user interaction
        System.out.println("Press any key to continue...");
        scanner.nextLine();
    }

    public static int multipleChoice(String[] choices) {
        int counter = 1;

        System.out.println();

        for (String question : choices) {
            System.out.println("     [" + counter + "] : " + question);
            counter++;
        }
        return waitForInt(1, choices.length);
    }

    public static void checkForExit(String txt) {
        // Check if the user's input indicated that they want to leave
        String[] ExitWords = { "exit", "leave", "quit", "end", "shutdown", "off" };
        boolean contains = Arrays.asList(ExitWords).contains(txt.toLowerCase());
        if (contains) {
            Main.exit();
        }
    }

}


