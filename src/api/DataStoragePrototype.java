package api;

import project.annotations.ProcessAPIPrototype;
import DataStoreRequest;

public class DataStoragePrototype{
	public void prototype(DataStorage dataStorage) {
		
		//write user's input to storage so computer can access
		DataStoreInput userInput = dataStorage.storeData(new dataStoreRequest());
		
		//retrieve computed data
		DataRetrieveComputed computedData = dataStorage.retrieveData(userInput);

	}
}