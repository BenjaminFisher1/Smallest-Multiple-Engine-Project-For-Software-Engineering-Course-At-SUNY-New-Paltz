package api;

import project.annotations.ProcessAPIPrototype;


public class DataStoragePrototype{
	public void prototype(DataStorage dataStorage) {
		
		//write user's input to storage so computer can access
		DataStoreInput userInput = dataStorage.storeData(new dataStoreRequest());
		
		//retrieve computed data
		DataRetrieveComputed computedData = dataStorage.retrieveData(userInput);

	}
}