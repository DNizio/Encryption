import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Coding coding = new Coding();
        Decoding decoding = new Decoding();
        byte correctChoice=0;
        do {
            System.out.println("[C}ode or [D]ecode?");
            Scanner scr = new Scanner(System.in);
            String text = scr.next();

            if (text.toUpperCase().equals("C")) {
                coding.coding();
                correctChoice = 1;
            } else if (text.toUpperCase().equals("D")) {
                decoding.decoding();
                correctChoice = 1;
            } else
                System.out.println("Try one more time by pressing C or D");
        }
        while (correctChoice == 0);
    }
}
