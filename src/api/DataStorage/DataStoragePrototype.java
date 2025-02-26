package api;
import java.util.arrayList;

import project.annotations.ProcessAPIPrototype;

//there is no more import here gradle 
public class DataStoragePrototype{
	public void prototype(DataStorage dataStorage) {
		
		
		
		//user's input before making it a DataStoreInput object
		DataStoreRequest userRawInput = new DataStoreRequest();
		
		//write user's input to storage so computer can access
		DataStoreInput userInput = dataStorage.storeData(userRawInput);
		
		//retrieve computed data
		DataRetrieveComputed computedData = dataStorage.retrieveData(userInput);

	}
}