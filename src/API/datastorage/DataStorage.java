package datastorage;

import project.annotations.NetworkAPI;

@ProcessAPI
public interface DataStorage{
	DataStoreInput storeData(DataToStore dataToStore);
	
	DataFetchResult retrieveData(RetrievedData output);
	
}
