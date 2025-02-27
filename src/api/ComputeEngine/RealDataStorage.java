import api.DataRetrieveComputed;
import api.DataStorage;
import api.DataStoreInput;
import api.DataStoreRequest;
import api.ComputeEngineAPI;
import api.ComputeUserInput;
import api.ProcessedJob;
import java.util.ArrayList;


public class RealDataStorage implements DataStorage{
	
	HashMap<ComputeUserInput, ProcessedJob> inputAndOutputMap = new HashMap<>();
	
	
	public void addInputs(ComputeUserInput userInput) {
		inputAndOutputMap.put(userInput, new ProcessedJob);			//inserts key and a temp value
	}
	
	public void addOutputs(ComputeUserInput userInput, ProcessedJob processedJob) {			//requires key to replace and value to replace
		inputAndOutputMap.replace(userInput, processedJob);
	}
}