package ex45;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Carolina Duarte
 */

import java.io.FileWriter;
import java.io.IOException;

public class fileEditor {
    public static void editedFileOutput(String output_file_name, String contents) throws IOException {

        FileWriter output = new FileWriter(output_file_name);

        contents = contents.replaceAll("utilize", "use");

        output.write(contents);

        output.close();
    }

}
