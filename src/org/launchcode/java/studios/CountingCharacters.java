package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {

    public static void main(String[] args) {
//        String defaultText = "If the product of two terms is zero then common sense says at least one
//        of the two terms has to be zero to start with. So if you move all the terms over to one side,
//        you can put the quadratics into a form that can be factored allowing that side of the equation
//        to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
//        defaultText.toUpperCase();
        String defaultText = "Hello!".toUpperCase();

        Scanner input = new Scanner(System.in);
        char[] charactersInString;
        HashMap<Character, Integer> characterCount = new HashMap<>();

        System.out.println("Please enter text or hit enter to exit");
        String inputText = input.nextLine().toUpperCase();

        if (inputText.equals("")) {
            charactersInString = defaultText.toCharArray();
        }else{
            charactersInString = inputText.toCharArray();
        }

        for (char letter : charactersInString) {
            if (characterCount.containsKey(letter)) {
                characterCount.put(letter, characterCount.get(letter) + 1);
            }else{
                characterCount.put(letter, 1);
            }
        }
        for(Map.Entry<Character, Integer> oneChar : characterCount.entrySet()) {
            System.out.println(oneChar.getKey() + ":" + oneChar.getValue());
        }
    }
}
