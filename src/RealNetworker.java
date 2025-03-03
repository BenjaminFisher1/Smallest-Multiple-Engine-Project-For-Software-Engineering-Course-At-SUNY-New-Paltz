
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import api.ComputeRequest;
import api.ComputeResult;
import api.ComputeUserInput;
import api.Networker;
import api.ProcessedJob;

public class RealNetworker implements Networker{
	
	RealComputeEngine realComputeEngine = new RealComputeEngine();
	RealDataStorage realDataStorage = new RealDataStorage();
	//needs to take user input and give to database
	
	public RealNetworker() {
		realComputeEngine = new RealComputeEngine();
		realDataStorage = new RealDataStorage();
	}

    String defaultFileName = "defualtFile";

	public ArrayList<Long> getList(String filename) {
		return readIntegers(filename);
	}
	
	public ComputeResult compute(ComputeRequest request) throws IOException {
		ArrayList<Long> tempList = new ArrayList<Long>();
		try{
            tempList = (ArrayList<Long>)readIntegers(request.getFileName()).clone();	//the warning it is giving here is irrelevant because the method should always return a new arraylist of longs
        } catch (Exception e) {
            request.newFileName(defaultFileName);
            tempList = (ArrayList<Long>)readIntegers(request.getFileName()).clone();

        }
		
		realDataStorage.storeAll(tempList);
		
		HashMap<ComputeUserInput, ProcessedJob> tempMap = new HashMap<>();
		tempMap = realDataStorage.getInAndOutMap();
		for(ComputeUserInput input : tempMap.keySet() ) {		//for each key in hash map of database
			realDataStorage.storeData(input, realComputeEngine.computeUponThis(input));		//replace each pair of (input, temp val) with (input, computedInput)
		}
		
		return new ComputeResult(realDataStorage.getOutputFile());
	}
	
	
	
	
	
	
	
	//filereading script 
	
    public ArrayList<Long> readIntegers(String filePath) {
        ArrayList<Long> integers = new ArrayList<>();


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



	
