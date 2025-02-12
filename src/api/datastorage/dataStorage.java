package datastore;

import project.annotations.ProcessAPI;

@ProcessAPI
public interface DataStorage{

	DataStoreInput storeData(DataToStore dataToStore);

	DataLookupComputedResult retrieveData(DataStoreInput userInput);

}
