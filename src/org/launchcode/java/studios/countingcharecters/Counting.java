package org.launchcode.java.studios.countingcharecters;
//CLASS VARIABLES


import java.util.ArrayList;
import java.util.HashMap;

//CONSTRUCTORS
public class Counting {


    public Counting() {


}
public void countCharacters(String wordToCount) {
char[] arrayofChars = wordToCount.toCharArray();
    HashMap<Character, Integer> myCharactersCount = new HashMap<>();
for (int i = 0; i < arrayofChars.length;i++){
//    System.out.println(arrayofChars[i]);

    char theCharacter = arrayofChars[i];
    if (myCharactersCount.containsKey(theCharacter) == false) {
        myCharactersCount.put(theCharacter, 1);
    } else {
        Integer theValue = myCharactersCount.get(theCharacter);
        theValue = theValue + 1;
        myCharactersCount.put(theCharacter, theValue);
    }
}
    ArrayList<Character> myCharacterKeys = new ArrayList<>(myCharactersCount.keySet());
   for(int i = 0; i < myCharacterKeys.size(); i++){
       Integer theValue = myCharactersCount.get(myCharacterKeys.get(i));
       System.out.println(myCharacterKeys.get(i) + ":" + theValue);
   }
}
}