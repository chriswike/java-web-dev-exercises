package org.launchcode.java.studios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {

    public static void main(String[] args)
            throws IOException
    {
//        String defaultText = "If the product of two terms is zero then common sense says at least one
//        of the two terms has to be zero to start with. So if you move all the terms over to one side,
//        you can put the quadratics into a form that can be factored allowing that side of the equation
//        to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
//        defaultText.toUpperCase();

        // Creating a path choosing file from local
        // directory by creating an object of Path class
        Path fileName = Path.of("C:\\Projects\\LC101_Homework\\2nd Unit\\java-web-dev-exercises\\src\\org\\launchcode\\java\\exercises\\phrase.txt");

        // Now calling Files.readString() method to
        // read the file
        String defaultText = Files.readString(fileName).toUpperCase().replaceAll("[^a-zA-z]", "");


        //String defaultText = "Hello!".toUpperCase();

        Scanner input = new Scanner(System.in);
        char[] charactersInString;
        HashMap<Character, Integer> characterCount = new HashMap<>();

        System.out.println("Please enter text or hit enter to exit");
        String inputText = input.nextLine().toUpperCase().replaceAll("[^a-zA-z]", "");

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
