package src;
import api.DataRetrieveComputed;
import api.DataStorage;
import api.DataStoreInput;
import api.DataStoreRequest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import api.ComputeEngineAPI;
import api.ComputeUserInput;
import api.ProcessedJob;

public class RealNetworker implements Networker{
	//needs to take user input and give to database
	public List<Long> getList(String filename) {
		return readIntegers(filename);
	}
	
	

	
	
	
	//filereading script 
	
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