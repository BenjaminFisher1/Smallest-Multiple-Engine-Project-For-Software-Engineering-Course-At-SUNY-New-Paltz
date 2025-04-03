import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import javax.management.RuntimeErrorException;

import api.ComputeRequest;
import api.ComputeResult;
import api.ComputeUserInput;
import api.Networker;
import api.ProcessedJob;

public class MultiNetworker implements Networker{
	RealComputeEngine realComputeEngine = new RealComputeEngine();
	RealDataStorage realDataStorage = new RealDataStorage();
	private int numThreads = 4;
	private final ExecutorService threadPool = Executors.newFixedThreadPool(numThreads);
	
	//needs to take user input and give to database
	
	public MultiNetworker() {
		realComputeEngine = new RealComputeEngine();
		realDataStorage = new RealDataStorage();
	}
//    public void newFileName(String s){
//        this.filename = s;
//    }
    String test = "defualtFile";

    String defaultFileName = "defualtFile";

	public ArrayList<Long> getList(String filename) {
		return readIntegers(filename);
	}



	public ComputeResult compute(ComputeRequest request) throws IOException {
		ArrayList<Long> tempList = new ArrayList<Long>();
		
		RealDataStorage localDataStorage = new RealDataStorage();
		

        try {
            tempList = (ArrayList<Long>) readIntegers(request.getFileName()).clone();			//maybe revisit if clone is needed
        } catch (Exception e) {
            request.newFileName(defaultFileName); // OR use 'test' if correct
            tempList = (ArrayList<Long>) readIntegers(request.getFileName()).clone();
		
        }
		
		localDataStorage.storeAll(tempList);
		
		
	
		HashMap<ComputeUserInput, ProcessedJob> tempMap = localDataStorage.getInAndOutMap();
		List<Future<Void>> futures = new ArrayList<>();
		
		
		//need blocking call see playgame use get() on the futures once theyve started see play game example
		
		//start threads
		for(ComputeUserInput input : tempMap.keySet() ) {		//for each key in hash map of database
			futures.add(threadPool.submit(() ->{
				
				localDataStorage.storeData(input, realComputeEngine.computeUponThis(input));	//replace each pair of (input, temp val) with (input, computedInput)
				return null;
			}));
			
		}
		//get results from threads (barricade)
		futures.forEach(future -> {
			try {
				future.get();
			} catch(Exception e) {
				throw new RuntimeException(e);
			}
		});
		
		
		return new ComputeResult(localDataStorage.getOutputFile(request.getOutputFileName()));
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

        } catch (FileNotFoundException e) {		//if file not found, we will default to the safetyFile.txt file, that contains simply "1"
            System.out.println("File not found: " + e.getMessage());
            
            try (FileReader reader = new FileReader("safetyFile")) {
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

            } catch (FileNotFoundException e2) {
                System.out.println("Missing safety file: " + e.getMessage());
                
            } catch (IOException e2) {
                System.out.println("Error reading file: " + e.getMessage());
            }

            return integers;
        
            
            
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