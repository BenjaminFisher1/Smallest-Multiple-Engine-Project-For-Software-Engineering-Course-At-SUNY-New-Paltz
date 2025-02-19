public class IntegrationTest {
    public void testIntegration(){
        InMemoryInputConfig inputConfig = new InMemoryInputConfig();
        inputConfig.inputs.addAll(List.of(1, 10, 25));

        InMemoryOutputConfig outputConfig = new InMemoryOutputConfig();

        DataStorage dataStorage = new DataStorageImpl();
        ComputeEngineAPI computeAPI = new ComputeEngineAPIImpl();

        DataStoreRequest request = new DataStoreRequest();
        DataStoreInput input = dataStorage.storeData(request);

        ProcessJob result = computeAPI.computeUponThis(new ComputeUserInput());
        DataRetrieveComputed computed = dataStorage.retrieveData(input);

        assertNotNull(result);
        assertNotNull(computed);
    }

}
