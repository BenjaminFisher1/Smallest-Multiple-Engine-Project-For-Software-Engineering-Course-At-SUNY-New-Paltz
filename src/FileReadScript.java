import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReadScript {

    public List<Long> readIntegers(String filePath) {
        List<Long> integers = new ArrayList<>();


        try (FileReader reader = new FileReader(filePath)) {
            StringBuilder currentNumber = new StringBuilder();
            int character;


            while ((character = reader.read()) != -1) {
                char ch = (char) character;


                if (Character.isDigit(ch)) {
                    currentNumber.append(ch);
                } else if (currentNumber.length() > 0) {
                    integers.add(Long.parseLong(currentNumber.toString()));
                    currentNumber.setLength(0);
                }
            }


            if (currentNumber.length() > 0) {
                integers.add(Long.parseLong(currentNumber.toString()));
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        return integers;
    }


    public void displayResult(long result, String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("Smallest multiple: " + result);
        } catch (IOException e) {
            System.out.println("Error writing result to file: " + e.getMessage());
        }
    }
}
