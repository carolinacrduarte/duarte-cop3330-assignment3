package ex41;

import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Carolina Duarte
 */

import static org.junit.jupiter.api.Assertions.assertEquals;

class nameSorterTest {

    @Test
    void namesReader() throws FileNotFoundException {
        Scanner inputFile = new Scanner(new File("C:\\Users\\carol\\IdeaProjects\\duarte-cop3330-assignment3\\src\\main\\java\\ex41\\exercise41_input.txt"));
        ArrayList<String> names = new ArrayList<>();
        nameSorter.namesReader(inputFile, names);
        int size = names.toArray().length;
        assertEquals(7, size); //Array is expected to have size of 7, because the input file lists 7 names.
    }

}