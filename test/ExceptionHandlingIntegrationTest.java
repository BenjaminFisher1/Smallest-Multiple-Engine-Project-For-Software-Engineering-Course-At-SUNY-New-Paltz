

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import api.ComputeRequest;
import api.ComputeResult;


public class ExceptionHandlingIntegrationTest {

    @Test
    public void testExceptionIntegration() throws IOException {
    	//initialize Networker
    	RealNetworker testNetworker = new RealNetworker();  
    	String testFilename = "";	//feed filereading script an empty file name
    	
    	ComputeRequest testRequest = new ComputeRequest(testFilename);		//If we cannot find a file with that name, which we cannot, because it is empty, we will default to using safetyFile.txt, which contains 1. 
    	ComputeResult testResult = testNetworker.compute(testRequest);
    	assertNotNull(testResult.getFile(), "File is null. Check that safetyFile.txt exists.");
    	
    	
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
