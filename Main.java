import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Coding coding = new Coding();
        Decoding decoding = new Decoding();
        String text="a";
        do {
            System.out.println("[C}ode or [D]ecode?");
            Scanner scr = new Scanner(System.in);
            text = scr.next();

            if (text.toUpperCase().equals("C")) {
                coding.coding();
            } else if (text.toUpperCase().equals("D")) {
                decoding.decoding();
            } else
                System.out.println("Try one more time by pressing C or D");
        }
        while (text.toUpperCase().equals("C") || text.toUpperCase().equals("D"));
    }
}
