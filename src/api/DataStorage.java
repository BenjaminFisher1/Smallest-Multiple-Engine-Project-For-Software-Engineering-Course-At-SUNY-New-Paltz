package api;

import java.util.ArrayList;
import java.util.HashMap;

import project.annotations.ProcessAPI;

@ProcessAPI
public interface DataStorage{
	
	
	
	DataRetrieveComputed retrieveData(DataStoreInput userInput);
	void storeData(ComputeUserInput userInput);
	void storeData(ComputeUserInput userInput, ProcessedJob processedJob);
	ProcessedJob retrieveData(ComputeUserInput userInput);
	void storeAll(ArrayList<Long> inputs);
	ArrayList<Long> unwrapProcessedJobs(HashMap<ComputeUserInput, ProcessedJob> hm);
	HashMap<ComputeUserInput, ProcessedJob> getInAndOutMap();
}