package ex43;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Carolina Duarte
 */

/*
This program generates a website body with the following specifications: an index.html file that contains the name of the site inside the <title> tag, the author in the <meta> tag, a folder for JavaScript files and a folder for CSS files. These should all be found in the working directory of the user.
*/

import java.util.Scanner;

/*
Main function:
    Prompts user for input corresponding to site name, author name, JavaScript folder or CSS folder.
    Calls websiteWriter function to create the appropriate file and folders.
*/

import static ex43.websiteGenerator.websiteWriter;

public class App {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String author, siteName;
        char js, css;

        //Getting user inputs:
        System.out.print("Site name: ");
        siteName = input.nextLine();
        System.out.print("Author: ");
        author = input.nextLine();
        System.out.print("Do you want a folder for JavaScript? ");
        js = input.next().charAt(0);
        System.out.print("Do you want a folder for CSS? ");
        css = input.next().charAt(0);

        websiteWriter(siteName, author, js, css); //Calling writer function.

        input.close();
    }
}




