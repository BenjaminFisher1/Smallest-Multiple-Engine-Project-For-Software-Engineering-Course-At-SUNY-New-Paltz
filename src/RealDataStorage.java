package api;
import java.util.ArrayList;

public class RealDataStorage implements DataStorage{
	
		public RealDataStorage(RealNetworker realNetworker){
			
		public HashMap<File, long> fileAndContentsMap = new HashMap<>();
		
			
			
				
		//reads user's input from file before making it a DataStoreInput object
		DataStoreRequest userRawInput = new DataStoreRequest(realNetworker.getRequest());
		
		//write user's input to storage so computer can access
		DataStoreInput userInput = dataStorage.storeData(userRawInput);
		
		//retrieve computed data
		DataRetrieveComputed computedData = dataStorage.retrieveData(userInput);

		}
		
		public void addFile(ComputeRequest request) {
			fileAndContentsMap.add(request.userFile, request.userFile);
		}
		
		public void addOutput(Long computedResult) {
			outputList.add(computedResult);
		}
		
		public long getComputed(ComputeRequest request) {
			return RealComputeEngine.run(request);
		}
}