package ex41;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Carolina Duarte
 */

/*
This program reads a list of names from an input text file called "exercise41_input.txt", sorts it alphabetically then prints the sorted list to an output text file called "exercise41_output.txt":
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*
{
Main function:
    Takes input text file.
    Scans data from input text file.
    Declares an array list to store data from file.
    Calls sorting function that reads and sorts.
    Outputs the sorted list into an output text file.
}
*/

public class App {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner inputFile = new Scanner(new File("C:\\Users\\carol\\IdeaProjects\\duarte-cop3330-assignment3\\src\\main\\java\\ex41\\exercise41_input.txt"));

        ArrayList<String> names = new ArrayList<>(); //Array list declaration.

        nameSorter.namesReader(inputFile, names);

        names.sort(String.CASE_INSENSITIVE_ORDER);

        inputFile.close();

        try {
            nameSorter.namesOutput(names);
        }

        catch (Exception e) { //Exception case.
            System.out.println(e);
        }
    }
}
