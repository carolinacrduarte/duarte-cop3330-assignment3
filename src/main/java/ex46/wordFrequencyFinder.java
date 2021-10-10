package ex46;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Carolina Duarte
 */

import java.util.Map;
import java.util.TreeMap;

/*
Word Frequency Finder:
    Splits the string content to find the correct word.
    Loops to iterate over the words.
    Checks if the array element is present in hash-map.
    Loop to iterate over the elements in the hash-map.
    Prints out key word and word frequency accordingly.
 */

public class wordFrequencyFinder {
    public static void getWordFrequency(String fileContent) {
        {
            Map<String, Integer> mp = new TreeMap<>();

            String[] arr = fileContent.split(" ");

            for (String s : arr) {
                if (mp.containsKey(s)) {
                    mp.put(s, mp.get(s) + 1);
                } else {
                    mp.put(s, 1);
                }
            }

            for (Map.Entry<String, Integer> entry :
                    mp.entrySet()) {
                System.out.print(entry.getKey() +
                        ": ");
                for (int i = 0; i < entry.getValue(); i++) {
                    System.out.print("*");
                }

                System.out.print("\n\n");
            }
        }
    }
}





