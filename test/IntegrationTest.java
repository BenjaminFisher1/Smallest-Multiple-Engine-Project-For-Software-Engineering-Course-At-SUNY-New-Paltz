


import java.io.IOException;

import org.junit.jupiter.api.Test;

import api.ComputeRequest;
import api.ComputeResult;


public class IntegrationTest {

    @Test
    public void testIntegration() throws IOException {
    	//initialize Networker
    	RealNetworker testNetworker = new RealNetworker();  
    	String testFilename = "testFile";
    	
    	ComputeRequest testRequest = new ComputeRequest(testFilename);
    	ComputeResult testResult = testNetworker.compute(testRequest);
    	
    	
//        // setup input and output configurations
//        InMemoryInput inputConfig = new InMemoryInput();
//        inputConfig.inputList.addAll(List.of(1, 10, 25));
//
//        InMemoryOutput output = new InMemoryOutput();
//
//        // initialize components
//        EmptyDataStorage dataStorage = new EmptyDataStorage();
//        EmptyComputeEngine computeAPI = new EmptyComputeEngine();
//
//        // store input data
//        DataStoreRequest request = new DataStoreRequest();
//        DataStoreInput input = dataStorage.storeData(request);
//
//        // perform computation
//        ProcessedJob result = computeAPI.computeUponThis(new ComputeUserInput());
//        DataRetrieveComputed computed = dataStorage.retrieveData(input);
//
//        // validate results
//        assertNotNull(result, "ProcessJob result should not be null");
//        assertNotNull(computed, "Retrieved computed data should not be null");
    }
}
