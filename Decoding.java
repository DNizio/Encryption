import java.util.LinkedList;
import java.util.Scanner;

class Decoding {

    void decoding()
     {
         Coding odmiana = new Coding();

         System.out.println("Input text to decode:");
         Scanner scanner = new Scanner(System.in);
         String codedText = scanner.nextLine();
         LinkedList<Integer> codedTextToInteger = new LinkedList<>();
         LinkedList<Integer> randomListFromCodedText = new LinkedList<>();
         LinkedList<Integer> intFromCodedList = new LinkedList<>();
         LinkedList<Character> decodedTextInChar = new LinkedList<>();

         for (int i=0; i<codedText.length(); i++){
             codedTextToInteger.add((int) codedText.charAt(i));
         }
         int k=0;
         for (int i=0; i<codedText.length(); i++){
             if (!(i%2==0)) {
                 randomListFromCodedText.add(codedTextToInteger.get(i));
             }
             else{
                 intFromCodedList.add(codedTextToInteger.get(i));
             }
        }
        for (int i=0; i<codedText.length() / 2; i++){
             int intOfDecodedText = intFromCodedList.get(i) - randomListFromCodedText.get(i) - 100;
             decodedTextInChar.add(odmiana.intToChar(intOfDecodedText));
        }
        for (int z=0; z<codedText.length()/2; z++){
            System.out.print(decodedTextInChar.get(z));
        }
     }
}