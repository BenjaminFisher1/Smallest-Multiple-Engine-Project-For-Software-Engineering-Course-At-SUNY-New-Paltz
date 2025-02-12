package datastore;

import project.annotations.ProcessAPIPrototype;

@ProcessAPIPrototype
public class dataStoragePrototype {

	public void prototype(DataStorage dataStorage) {
		// write user input data
		DataStoreInput userInput = dataStore.storeData(new DataToStore());
		
		// retrieve the computed result from user input
		DataLookupResult computedData = dataStorage.retrieveData(userInput);
	}
}
