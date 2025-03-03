
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import api.ComputeUserInput;
import api.DataRetrieveComputed;
import api.DataStorage;
import api.DataStoreInput;
import api.ProcessedJob;


public class RealDataStorage implements DataStorage{
	
	private HashMap<ComputeUserInput, ProcessedJob> inputAndOutputMap;
	
	public RealDataStorage(){
	
		inputAndOutputMap =  new HashMap<>();
	
	}
	
	public void storeData(ComputeUserInput userInput) {
		try {
			this.inputAndOutputMap.put(userInput, new ProcessedJob());			//inserts key and a temp value
		}catch(Exception missingMap){
			inputAndOutputMap = new HashMap<>();		//redefine map and try again
		}
	}	
	
	public void storeData(ComputeUserInput userInput, ProcessedJob processedJob) {			//requires key to replace and value to replace
		try {
			this.inputAndOutputMap.replace(userInput, processedJob);
		}catch(Exception missingKeyUserInput){					//if userInput is missing from keys, simply put instead of replace.
			this.inputAndOutputMap.put(userInput, processedJob);
		}
		
	}
	
	public ProcessedJob retrieveData(ComputeUserInput userInput){
		try {
			return this.inputAndOutputMap.get(userInput);
		}catch(Exception missingKeyUserInput){		//if: userInput does not exist in Key set,
			return new ProcessedJob();				//then: return an empty ProcessedJob.
		}
		
	}
	
	public void storeAll(ArrayList<Long> inputs) {
		for(long singleInput: inputs) {
			try {
				storeData(new ComputeUserInput(singleInput));
			}catch(Exception inputGeneralException){			//if: cannot create ComputeUserInput,
				storeData(new ComputeUserInput(1));				//then: create ComputeUserInput using 1 (default value)
			}
			
		}
	}
	
	public ArrayList<Long> unwrapProcessedJobs(HashMap<ComputeUserInput, ProcessedJob> hm){
		ArrayList<Long> retArrayList = new ArrayList<>();
		for(ProcessedJob job: hm.values()) {
			try {
				retArrayList.add(job.getValue());
			}catch(Exception valueIsNotTypeLong) {			//if: job.getValue is not of type long
				retArrayList.add((long) 1);					//then: add a placeholder long of 1
			}
			
		}
		return retArrayList;
	}
	
	public HashMap<ComputeUserInput, ProcessedJob> getInAndOutMap(){
		try {
			return this.inputAndOutputMap;
		}catch(Exception missingInputAndOutputMap) {					//if: inputAndOutputMap is somehow missing
			return new HashMap<ComputeUserInput, ProcessedJob>();		//then: return an empty hashmap of the same types
		}
		
	}
	
	public File getOutputFile() throws IOException {
		FileWriter fileWriter = new FileWriter("outputFile.txt");
		 try (BufferedWriter writer = new BufferedWriter(fileWriter)) {
	            for (ProcessedJob job : this.getInAndOutMap().values()) {
	                writer.write((int) job.getValue());
	                writer.newLine();
	            }
		 }
		 return new File("outputFile.txt");
	}
	
	
	
	
	
	
	//BAD CODE BUT HAS TO BE HERE TO PREVENT GRADLE FROM HATING !! DO NOT USE FOR ANYTHING
		public DataRetrieveComputed retrieveData(DataStoreInput userInput) {
		DataRetrieveComputed doNotUse = new DataRetrieveComputed();
		return doNotUse;
		
		
	}
		
}