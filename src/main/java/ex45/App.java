package ex45;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Carolina Duarte
 */

/*
This program takes input file text named exercise45_input.txt, reads the file and looks for all occurrences of the word "utilize". Then it replaces each occurrence with the synonym "use". At last, it writes the modified file to a new output file named after the desired user's input.
*/

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static ex45.fileEditor.editedFileOutput;

/*
Main function:
    Requests user's desired output file name.
    Reads input text file via the scanner.
    Builds a string with all the input text scanned on the file.
    Calls file editor function and closes input file.
*/

public class App {
    public static void main(String[] args) throws IOException {

        Scanner userInput = new Scanner (System.in);
        System.out.print("Desired output file name: ");
        String output_file_name = userInput.nextLine();

        Scanner inputFile = new Scanner(new File("C:\\Users\\carol\\IdeaProjects\\duarte-cop3330-assignment3\\src\\main\\java\\ex45\\exercise45_input.txt"));
        String text_lines;

        StringBuilder sb = new StringBuilder();
        while (inputFile.hasNextLine()) {
            text_lines = inputFile.nextLine();
            sb.append("\n").append(text_lines);
        }
        String contents = sb.toString();

        editedFileOutput(output_file_name, contents);

        inputFile.close();
    }
}
