package ex42;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Carolina Duarte
 */

import java.util.Scanner;

/*
{
Print function:
    Takes input data.
    Loops through each data line.
    Reads, organizes, spaces out and prints out data on console.
}
*/

public class dataPrinter {
    public static Object dataPrint(Scanner input) {

        while (input.hasNextLine()) { //Loop to read data until file is over.
            String s = input.nextLine();
            String[] temp = s.split(","); //Spaces out data when it recognizes a comma.
            System.out.printf("%-17s%-17s%-17s\n", temp[0], temp[1], temp[2]);
        }

        return null;
    }
}


