

import EmptyImplementations.EmptyComputeEngine;
import EmptyImplementations.EmptyDataStorage;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.List;
//
//import api.InMemoryInputConfig;
//import api.InMemoryOutputConfig;
//import api.DataStorage;
//import api.DataStorageImpl;
import api.ComputeEngineAPI;
import api.DataStoreRequest;
import api.DataStoreInput;
import api.ComputeUserInput;
import api.ProcessedJob;
import api.DataRetrieveComputed;


public class IntegrationTest {

    @Test
    public void testIntegration() {
        // setup input and output configurations
        InMemoryInput inputConfig = new InMemoryInput();
        inputConfig.inputList.addAll(List.of(1, 10, 25));

        InMemoryOutput output = new InMemoryOutput();

        // initialize components
        EmptyDataStorage dataStorage = new EmptyDataStorage();
        EmptyComputeEngine computeAPI = new EmptyComputeEngine();

        // store input data
        DataStoreRequest request = new DataStoreRequest();
        DataStoreInput input = dataStorage.storeData(request);

        // perform computation
        ProcessedJob result = computeAPI.computeUponThis(new ComputeUserInput());
        DataRetrieveComputed computed = dataStorage.retrieveData(input);

        // validate results
        assertNotNull(result, "ProcessJob result should not be null");
        assertNotNull(computed, "Retrieved computed data should not be null");
    }
}
