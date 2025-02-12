package api;

import project.annotations.ProcessAPIPrototype;

//there is no more import here gradle 
public class DataStoragePrototype{
	public void prototype(DataStorage dataStorage) {
		
		//write user's input to storage so computer can access
		DataStoreInput userInput = dataStorage.storeData(new dataStoreRequest());
		
		//retrieve computed data
		DataRetrieveComputed computedData = dataStorage.retrieveData(userInput);

	}
}