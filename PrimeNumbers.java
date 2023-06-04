import org.json.JSONArray;
import java.io.FileWriter;
import java.io.IOException;

public class PrimeNumbers {
    public static void main(String[] args) {
        JSONArray jsonArray = new JSONArray();

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                jsonArray.put("BIGBANG");
            } else if (i % 3 == 0) {
                jsonArray.put("BIG");
            } else if (i % 5 == 0) {
                jsonArray.put("BANG");
            } else {
                jsonArray.put(Integer.toString(i));
            }
        }

        try (FileWriter fileWriter = new FileWriter("output.json")) {
            fileWriter.write(jsonArray.toString());
            System.out.println("Array written to output.json file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
