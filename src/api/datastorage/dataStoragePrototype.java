package datastore;

import project.annotations.ProcessAPIPrototype;

@ProcessAPIPrototype
public class DataStoragePrototype {

	public void prototype(DataStorage dataStorage) {
		// write user input data
		DataStoreInput userInput = dataStore.storeData(new DataToStore());
		
		// retrieve the computed result from user input
		DataLookupComputedResult computedData = dataStorage.retrieveData(userInput);
	}
}
