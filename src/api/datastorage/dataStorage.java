package datastore;

import project.annotations.ProcessAPI;

@ProcessAPI
public interface dataStorage {

	DataStoreKey storeData(DataToStore dataToStore);

	DataLookupResult retrieveData(DataStoreInput userInput);

}
