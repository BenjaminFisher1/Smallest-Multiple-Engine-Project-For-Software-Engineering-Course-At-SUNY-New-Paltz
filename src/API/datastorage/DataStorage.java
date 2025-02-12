package datastorage;

import project.annotations.ProcessAPI;

@ProcessAPI
public interface DataStorage{
	DataStoreInput storeData(DataToStore dataToStore);
	
	DataFetchResult retrieveData(RetrievedData output);
	
}
