package ex42;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static ex42.dataPrinter.dataPrint;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void main() throws FileNotFoundException {
        Scanner inputFile = new Scanner(new File("C:\\Users\\carol\\IdeaProjects\\duarte-cop3330-assignment3\\src\\main\\java\\ex42\\exercise42_input.txt"));
        assertNotEquals("Error, file not found!", dataPrint(inputFile));
    }
}