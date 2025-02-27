package src;
import api.DataRetrieveComputed;
import api.DataStorage;
import api.DataStoreInput;
import api.DataStoreRequest;
import api.ComputeEngineAPI;
import api.ComputeUserInput;
import api.ProcessedJob;
import java.util.HashMap;
import java.util.ArrayList;


public class RealDataStorage implements DataStorage{
	
	HashMap<ComputeUserInput, ProcessedJob> inputAndOutputMap = new HashMap<>();
	
	
	public static void storeData(ComputeUserInput userInput) {
		inputAndOutputMap.put(userInput, new ProcessedJob());			//inserts key and a temp value
	}
	
	public void storeData(ComputeUserInput userInput, ProcessedJob processedJob) {			//requires key to replace and value to replace
		inputAndOutputMap.replace(userInput, processedJob);
	}
	
	public ProcessedJob retrieveData(ComputeUserInput userInput){
		return inputAndOutputMap.get(userInput);
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
	
	
	
	
	//BAD CODE BUT HAS TO BE HERE TO PREVENT GRADLE FROM HATING !! DO NOT USE FOR ANYTHING
		public DataRetrieveComputed retrieveData(DataStoreInput userInput) {
		DataRetrieveComputed doNotUse = new DataRetrieveComputed();
		return doNotUse;
		
		
	}
		
}