# What Is This

This is essentially a way to shortcut some of the repetitive work done when doing assignments for ICT12 course. This page contains 3 Java files that can be easily modified to build the famous 7 part user interface. 


# How To Use It

To start off copy these files into your project, you will firstly want to adjust the Printer Java file and add your own user interface elements into the print line statements. You will also want to modify the `handleInput();` function in the `Main.java` class

    private static void handleInput(String input) {
    switch(input){
	    case "1"
		    //DO MAIN PROGRAM FUNCTION
		    break;
	    case"2":
		    Printer.clearScreen();
		    Printer.printInfoMenu();
		    WaitFor.waitForInteraction();
		    break;
    case "3":
	    running = false;}
	    break;
	default:
		System.out.println("Please enter valid input")
		WaitFor.waitForInteraction();
		break;

Here you can add your own cases and modify it to your liking.
