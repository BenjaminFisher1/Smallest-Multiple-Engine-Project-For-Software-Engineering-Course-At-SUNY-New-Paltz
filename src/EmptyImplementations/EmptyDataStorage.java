package EmptyImplementations;
import api.DataRetrieveComputed;
import api.DataStorage;
import api.DataStoreInput;
import api.DataStoreRequest;

public class EmptyDataStorage implements DataStorage{
	
	public DataStoreInput storeData(DataStoreRequest dataStoreRequest) {
		return new DataStoreInput(){};
	}
	
	public DataRetrieveComputed retrieveData(DataStoreInput userInput) {
		return new DataRetrieveComputed(){};
	}
		
}