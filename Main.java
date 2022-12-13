public class Main {

    public volatile static boolean running;


    public static void main(String[] args) {
        String userInput;

        running = true;

        Printer.printTitle();
        Printer.printIntro();
        WaitFor.waitForInteraction();

        Printer.clearScreen();

        while(running){
            Printer.clearScreen();
            Printer.printTitle();
            Printer.printMainMenu();

            handleInput(WaitFor.waitForString());
        }

        Printer.clearScreen();
        Printer.printTitle();
        Printer.printOutro();
        WaitFor.waitForInteraction();

        System.out.println("Goodbye!");
    }

    private static void handleInput(String input) {
        switch(input){
            case "1":
                //DO MAIN PROGRAM FUNCTION
                break;
            case "2":
                Printer.clearScreen();
                Printer.printInfoMenu();
                WaitFor.waitForInteraction();
                break;
            case "3":
                running = false;

        }
    }

    public static void exit(){
        running = false;
    }
}
