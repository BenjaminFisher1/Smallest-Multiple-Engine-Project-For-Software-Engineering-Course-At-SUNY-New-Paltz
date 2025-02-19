package api;

import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class TestDataStorage{
	
	
	@Test
	public void testStoreData(){
		
		DataStorage testDataStorage = mock(DataStorage.class);
		DataStoreInput testDataStoreInput = mock(DataStoreInput.class);
		DataStoreRequest testDataStoreRequest = new DataStoreRequest();		
		DataRetrieveComputed testDataRetrieveComputed = mock(DataRetrieveComputed.class);
		
		when(testDataStorage.storeData(testDataStoreRequest)).thenReturn(testDataStoreInput);
		Assert.assertEquals(testDataStoreInput, testDataStorage.storeData(testDataStoreRequest));
	}
	
	@Test
	public void testRetrieveData() {
		DataStorage testDataStorage = mock(DataStorage.class);
		DataStoreInput testDataStoreInput = mock(DataStoreInput.class);
		DataStoreRequest testDataStoreRequest = new DataStoreRequest();
		DataRetrieveComputed testDataRetrieveComputed = mock(DataRetrieveComputed.class);
		
		when(testDataStorage.retrieveData(testDataStoreInput)).thenReturn(testDataRetrieveComputed);
		Assert.assertEquals(testDataRetrieveComputed, testDataStorage.retrieveData(testDataStoreInput));
	}
	//test
	
}