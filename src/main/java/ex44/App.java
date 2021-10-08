package ex44;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Carolina Duarte
 */

/*
This program takes a product name as user input and prints out on console the current price and quantity for said product, by getting that data from a JSON file. If no product is found, it informs the user and prompts again.
*/

import java.io.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import static ex44.productScan.productScanner;

/*
Main function:
    Reads JSON file through a parser.
    Creates a JSON object to store data from file.
    Has a buffered reader object to take user input.
    Prompts for user input then calls product scanner function.
    If input does not exist in product inventory, inform the user.
    Repeats prompt until user inputs a product that exists.
*/

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        JSONParser parser = new JSONParser();
        try {
            String input;

            Object obj = parser.parse(new FileReader("C:\\Users\\carol\\IdeaProjects\\duarte-cop3330-assignment3\\src\\main\\java\\ex44\\exercise44_input.json"));

            JSONObject jsonObject = (JSONObject)obj;
            JSONArray subjects = (JSONArray)jsonObject.get("products");

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int x;

            do {
                System.out.print("What is the product name? ");
                input = bufferedReader.readLine();
                x = productScanner(input, subjects);
                if (x == 0) {
                    System.out.print("Sorry, that product was not found in our inventory.\n");
                }
            }
            while (x != 1);
            {
                //Repeat until productScanner gets a product match.
            }

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}

