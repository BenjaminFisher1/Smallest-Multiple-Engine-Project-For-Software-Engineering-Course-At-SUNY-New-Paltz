package EmptyImplementations;
import java.util.ArrayList;
import java.util.HashMap;

import api.ComputeUserInput;
import api.DataRetrieveComputed;
import api.DataStorage;
import api.DataStoreInput;
import api.DataStoreRequest;
import api.ProcessedJob;

public class EmptyDataStorage implements DataStorage{
	
	public DataStoreInput storeData(DataStoreRequest dataStoreRequest) {
		return new DataStoreInput(){};
	}
	
	public DataRetrieveComputed retrieveData(DataStoreInput userInput) {
		return new DataRetrieveComputed(){};
	}

	@Override
	public void storeData(ComputeUserInput userInput) {
		
	}

	@Override
	public void storeData(ComputeUserInput userInput, ProcessedJob processedJob) {
	
	}

	@Override
	public ProcessedJob retrieveData(ComputeUserInput userInput) {
		return null;
	}

	@Override
	public void storeAll(ArrayList<Long> inputs) {
		
	}

	@Override
	public ArrayList<Long> unwrapProcessedJobs(HashMap<ComputeUserInput, ProcessedJob> hm) {
		return null;
	}

	@Override
	public HashMap<ComputeUserInput, ProcessedJob> getInAndOutMap() {
		return null;
	}
		
}