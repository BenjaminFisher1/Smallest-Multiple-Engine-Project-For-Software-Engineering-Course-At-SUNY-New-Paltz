package emptyImplementations;

import api.ComputeEngineAPI;
import api.ComputeUserInput;
import api.ProcessedJob;

public class EmptyComputeEngine implements ComputeEngineAPI{
		
		
	    public ProcessedJob computeUponThis(ComputeUserInput generalInput) {
	    	
//	    	ProcessJob placeholderProcessJob = new ProcessJob();
	    	
	    	return new ProcessedJob(){};
	    }
	    
	   
}

