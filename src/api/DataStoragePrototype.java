package api;

import java.util.ArrayList;
import java.util.HashMap;

import project.annotations.ProcessAPIPrototype;

 
public class DataStoragePrototype implements DataStorage{
	public void prototype(DataStorage dataStorage) {
		
		//user's input before making it a DataStoreInput object
		DataStoreRequest userRawInput = new DataStoreRequest();
		
		//write user's input to storage so computer can access
//		DataStoreInput userInput = dataStorage.storeData(userRawInput);
		
		//retrieve computed data
//		DataRetrieveComputed computedData = dataStorage.retrieveData(userInput);

	}

	@Override
	public DataRetrieveComputed retrieveData(DataStoreInput userInput) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void storeData(ComputeUserInput userInput) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void storeData(ComputeUserInput userInput, ProcessedJob processedJob) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ProcessedJob retrieveData(ComputeUserInput userInput) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void storeAll(ArrayList<Long> inputs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Long> unwrapProcessedJobs(HashMap<ComputeUserInput, ProcessedJob> hm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashMap<ComputeUserInput, ProcessedJob> getInAndOutMap() {
		// TODO Auto-generated method stub
		return null;
	}
}