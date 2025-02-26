package api;


public class EmptyComputeEngine implements ComputeEngineAPI{
		
		
	    public ProcessedJob computeUponThis(ComputeUserInput generalInput) {
	    	
//	    	ProcessJob placeholderProcessJob = new ProcessJob();
	    	
	    	return new ProcessedJob(){};
	    }
	    
	   
}

//hello
//gradle stop breaking please