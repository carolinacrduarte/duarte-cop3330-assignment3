package ex42;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Carolina Duarte
 */

/*
This program reads the data from an input text file called "exercise42_input.txt", processes the data and displays the results formatted as a table, evenly spaced.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import static ex42.dataPrinter.dataPrint;

/*
{
Main function:
    Takes input text file.
    Scans data from input text file.
    Calls print function that reads, organizes and prints out data on console.
}
*/

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner inputFile = new Scanner(new File("C:\\Users\\carol\\IdeaProjects\\duarte-cop3330-assignment3\\src\\main\\java\\ex42\\exercise42_input.txt"));

        System.out.printf("%-17s%-17s%-17s\n", "Last", "First", "Salary");
        System.out.println("----------------------------------------");

        try{
            dataPrint(inputFile);
        }

        catch (Exception e) { //Exception case.
            System.out.println("Error, file not found!");
        }

        inputFile.close();
    }
}
