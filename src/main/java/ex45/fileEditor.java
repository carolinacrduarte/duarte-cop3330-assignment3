package ex45;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Carolina Duarte
 */

import java.io.FileWriter;
import java.io.IOException;

/*
File editor:
    Takes in user input for output file name and contents of the input file via a built string.
    Uses replaceAll function to perform word replacement.
    Writes a new edited file to output and closes output file.
*/

public class fileEditor {
    public static void editedFileOutput(String output_file_name, String contents) throws IOException {

        FileWriter output = new FileWriter(output_file_name);

        contents = contents.replaceAll("utilize", "use");

        output.write(contents);

        output.close();
    }

}
