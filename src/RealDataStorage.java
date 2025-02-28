
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
		this.inputAndOutputMap.put(userInput, new ProcessedJob());			//inserts key and a temp value
	}
	
	public void storeData(ComputeUserInput userInput, ProcessedJob processedJob) {			//requires key to replace and value to replace
		this.inputAndOutputMap.replace(userInput, processedJob);
	}
	
	public ProcessedJob retrieveData(ComputeUserInput userInput){
		return this.inputAndOutputMap.get(userInput);
	}
	
	public void storeAll(ArrayList<Long> inputs) {
		for(long singleInput: inputs) {
			storeData(new ComputeUserInput(singleInput));
		}
	}
	
	public ArrayList<Long> unwrapProcessedJobs(HashMap<ComputeUserInput, ProcessedJob> hm){
		ArrayList<Long> retArrayList = new ArrayList<>();
		for(ProcessedJob job: hm.values()) {
			retArrayList.add(job.getValue());
		}
		return retArrayList;
	}
	
	public HashMap<ComputeUserInput, ProcessedJob> getInAndOutMap(){
		return this.inputAndOutputMap;
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