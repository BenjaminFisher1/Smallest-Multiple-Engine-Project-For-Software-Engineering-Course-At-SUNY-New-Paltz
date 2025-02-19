package api;

public class EmptyDataStore implements DataStorage{
	
	public DataStoreInput storeData(DataStoreRequest dataStoreRequest) {
		return new DataStoreInput(){};
	}
	
	public DataRetrieveComputed retrieveData(DataStoreInput userInput) {
		return new DataRetreiveComputed(){};
	}
		
}