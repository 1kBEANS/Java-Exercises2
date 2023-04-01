package characters;

import java.util.HashMap;
import java.util.Map;
//import java.util.Scanner;
public class Counting {
    public static void main(String[] args) {
        HashMap<Character, Double> characterCount = new HashMap<>();

        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. " +
                "So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. " +
                "Once you’ve done that, it’s pretty straightforward from there.";

        char[] characters = quote.toCharArray();

        for (char index: characters) {
            if (characterCount.containsKey(index)) {
                characterCount.put(index, characterCount.get(index) + 1);
            } else {
                characterCount.put(index, (double) 1);
            }

            for (Map.Entry<Character, Double> character : characterCount.entrySet()) {
                System.out.println(character.getKey() + ": " + character.getValue());
            }
        }
    }
}
