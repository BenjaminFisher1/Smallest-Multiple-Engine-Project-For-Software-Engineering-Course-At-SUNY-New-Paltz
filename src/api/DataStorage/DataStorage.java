package api;

import project.annotations.ProcessAPI;

@ProcessAPI
public interface DataStorage{
	
	DataStoreInput storeData(DataStoreRequest dataStoreRequest);
	
	DataRetrieveComputed retrieveData(DataStoreInput userInput);
	
}