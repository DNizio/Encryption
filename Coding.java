import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class Coding {

    void coding (){
        System.out.println("Input text to code:");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String text = scanner.nextLine();
        LinkedList<Integer> textToInteger = new LinkedList<>();
        LinkedList<Integer> randomList = new LinkedList<>();
        LinkedList<Integer> codedList = new LinkedList<>();

        for (int i =0; i<text.length(); i++){
            randomList.add(random.nextInt(50) + 32);
            textToInteger.add((int) text.charAt (i));
        }
        int counterTextToInteger = 0;
        int counterRandomList = 0;
                for (int i=0; i < text.length() * 2; i++){
            if (i==0 || i%2==0){
                int sumTextAndRandom = textToInteger.get(counterTextToInteger) + randomList.get(counterTextToInteger) + 100;
                codedList.add (sumTextAndRandom);
                counterTextToInteger++;
            }
            else{
                codedList.add(randomList.get(counterRandomList));
                counterRandomList++;
            }
        }
        System.out.println("Coded text:");
        for (int i=0; i < text.length() *2; i++){
            char letter =  intToChar(codedList.get(i));
           System.out.print(letter);
        }
    }

    static char intToChar(int a){
        char letter = (char) a;
        return letter;
    }
}
