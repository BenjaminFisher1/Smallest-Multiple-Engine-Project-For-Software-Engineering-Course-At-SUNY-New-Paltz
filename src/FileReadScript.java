import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class FileReadScript {
    public List<Integer> readIntegers(String filePath){
        List<Integer> integers = new ArrayList<>();
        try(FileReader reader = new FileReader(filePath)){
            StringBuilder currentNumber = new StringBuilder();
            int character;
            while((character = reader.read()) !=1){
                char ch = (char) character;
                if (Character.isDigit(ch)){
                    currentNumber.append(ch);
                } else if (currentNumber.length() > 0){
                    integers.add((int) Long.parseLong(currentNumber.toString()));
                    currentNumber.setLength(0);
                }
            }
            if(currentNumber.length() > 0){
                integers.add((int) Long.parseLong(currentNumber.toString()));
            }
        }
        catch (IIOException e){
            System.out.println("Error!!!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return integers;
    }
    public void displayResult(long result, String filePath){
        try(FileWriter = new FileWriter(filePath)){
            writer.write("Smallest multiple: " + result);
        } catch(IIOException e){
            System.out.println("Error!!!!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

