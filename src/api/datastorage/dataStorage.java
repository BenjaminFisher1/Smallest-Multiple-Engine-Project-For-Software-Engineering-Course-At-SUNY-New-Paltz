package datastore;

import project.annotations.ProcessAPI;

@ProcessAPI
public interface DataStorage {

	DataStoreKey storeData(DataToStore dataToStore);

	DataLookupResult retrieveData(DataStoreInput userInput);

}
