package ex43;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Carolina Duarte
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
Generator function:
    Gets user input answers.
    Creates new html file.
    Includes site name and author name on the file via FileWrite function.
    Creates folders upon user request.
    Prints user directory path to file and folders.
*/

public class websiteGenerator {
    public static Object websiteWriter(String siteName, String author, char js, char css){
        String currentPath = System.getProperty("user.dir");
        currentPath += "\\"+siteName;
        File website = new File(currentPath);
        boolean websiteCreated = website.mkdir();

        if(websiteCreated)
        { //If website is created then:
            System.out.println("Created " + currentPath); //Print path.
            try
            {   //Write HTML file.
                FileWriter bodyWriter = new FileWriter(currentPath +"\\index.html");
                bodyWriter.write("<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n");
                bodyWriter.write("\t<meta author=\""+author+"\">\n");
                bodyWriter.write("\t<title>"+siteName+"</title>\n");
                bodyWriter.write("</head>\n<body>\n\n</body>\n</html>");
                bodyWriter.close();

                System.out.println("Created " + currentPath +"\\index.html"); //Print path.

                if(js == 'y' || js == 'Y')
                { //If user requested JavaScript folder, then create it:
                    File jsFolder = new File(currentPath +"\\js");
                    boolean jsCreated = jsFolder.mkdir();
                    if(jsCreated)
                    {
                        System.out.println("Created " + jsFolder+"\\"); //Print path.
                    }
                    else
                    {
                        System.out.println("Js folder not created.");
                    }
                }
                if(css == 'y' || css == 'Y')
                { //If user requested CSS folder, then create it:
                    File cssFolder = new File(currentPath +"\\css");
                    boolean cssCreated = cssFolder.mkdir();
                    if(cssCreated)
                    {
                        System.out.println("Created " + cssFolder+"\\"); //Print path.
                    }
                    else
                    {
                        System.out.println("CSS folder not created.");
                    }
                }
            }
            catch(IOException e)
            {
                System.out.println("HTML file was not created.");
            }
        }
        else
        {
            System.out.println("Website was not created.");
        }

        return null;
    }
}
