public class Printer {
    private Printer(){}

    public static void printTitle(){
        System.out.println("REPLACE WITH TITLE");
    }

    public static void printIntro(){
        System.out.println("REPLACE WITH FRIENDLY INTRO MESSAGE");
    }

    public static void printMainMenu(){
        System.out.println("REPLACE MAIN PROGRAM MENU");//Make it so user types number to pick options 1 for main, 2 for help, 3 for exit
    }

    public static void printOutro(){
        System.out.println("REPLACE WITH FRIENDLY OUTRO");
    }

    public static void printInfoMenu(){
        System.out.println("REPLACE WITH INFORMATIONAL MENU SCREEN");
    }

    public static void clearScreen(){
        System.out.println("\f");
        System.out.println("");
    }
}
