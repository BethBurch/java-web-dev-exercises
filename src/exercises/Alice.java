package exercises;
import java.util.Scanner;
public class Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //makes the scanner ready to be used like a readline sync it makes space for user input
        String firstSentence = ("Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'");
        System.out.println("Enter a Word to Search: "); //prints a statement asking for user to enter word
        String chosenWord = input.nextLine().toLowerCase(); // uses whatever was entered for input and holds it in lowercase.
        boolean found = firstSentence.toLowerCase().contains(chosenWord); // will determine if a word is found in (firstSentence) also makes it lower case
        System.out.println("Word located: " + found); //prints the word was found
        Integer index = firstSentence.indexOf(chosenWord); //where is the word
        Integer length = chosenWord.length(); //the length of the word
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String modifiedSentence = firstSentence.replace(chosenWord, "");
        System.out.println(modifiedSentence); // the modified sentence now is in (modifiedSentence) from line14
    }

}