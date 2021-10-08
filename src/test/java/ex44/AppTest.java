package ex44;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.io.IOException;

import static ex44.productScan.productScanner;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void main() throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        String input = "Thing";

        Object obj = parser.parse(new FileReader("C:\\Users\\carol\\IdeaProjects\\duarte-cop3330-assignment3\\src\\main\\java\\ex44\\exercise44_input.json"));

        JSONObject jsonObject = (JSONObject)obj;
        JSONArray subjects = (JSONArray)jsonObject.get("products");

        assertEquals(1, productScanner(input,subjects));

    }
}