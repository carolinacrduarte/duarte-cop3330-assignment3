package ex46;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Carolina Duarte
 */

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import static ex46.fileConverter.readFileIntoString;
import static ex46.wordFrequencyFinder.getWordFrequency;

/*
Main Function:
    Declares strings needed.
    Calls on readFileIntoString function to convert text into a single string.
    Calls on getWordFrequency function.
 */

public class App {
    public static void main(String[] args) throws IOException {

        String filePath = "C:\\Users\\carol\\IdeaProjects\\duarte-cop3330-assignment3\\src\\main\\java\\ex46\\exercise46_input.txt";

        String fileContent = null;

        try {
            fileContent = readFileIntoString(filePath, StandardCharsets.UTF_8);
            fileContent = fileContent.replaceAll("(\\r\\n\\t)", " ");
            fileContent = fileContent.replaceAll("\\s+"," ").trim();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        assert fileContent != null;

        getWordFrequency(fileContent);
    }
}
