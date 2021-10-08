package ex44;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Carolina Duarte
 */

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/*
Product scanner:
    Scans for the product name by going through the JSON object.
    If there is a match, prints name, price and quantity.
*/

public class productScan {
    public static int productScanner(String input, JSONArray subjects) {
        int count = 0;

        for (Object subject : subjects) {
                JSONObject json = (JSONObject) subject; //Will search through JSON object.
                String name = (String) json.get("name");

                if (input.equalsIgnoreCase(name)) {
                    System.out.println("Name: " + name);
                    System.out.println("Price: " + json.get("price"));
                    System.out.println("Quantity: " + json.get("quantity"));
                    count = 1;
                    break;
                }
        }
        return count;
        }
}

