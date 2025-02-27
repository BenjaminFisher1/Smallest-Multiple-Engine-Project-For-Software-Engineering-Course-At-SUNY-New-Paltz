package api;

import project.annotations.ProcessAPI;

@ProcessAPI
public interface DataStorage{
	
	
	
	DataRetrieveComputed retrieveData(DataStoreInput userInput);
	
}