package ex46;

import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import static ex46.fileConverter.readFileIntoString;
import static ex46.wordFrequencyFinder.getWordFrequency;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void main() {
        String filePath = "C:\\Users\\carol\\IdeaProjects\\duarte-cop3330-assignment3\\src\\main\\java\\ex46\\exercise46_input.txt";

        String fileContent = null;

        try {
            fileContent = readFileIntoString(filePath, StandardCharsets.UTF_8);
            fileContent = fileContent.replaceAll("(\\r\\n\\t)", " ");
            fileContent = fileContent.replaceAll("\\s+"," ").trim();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        assert fileContent != null;

        assertEquals("badger: *******\n\nmushroom: **\n\nsnake: *\n\n", getWordFrequency(fileContent));

    }
}