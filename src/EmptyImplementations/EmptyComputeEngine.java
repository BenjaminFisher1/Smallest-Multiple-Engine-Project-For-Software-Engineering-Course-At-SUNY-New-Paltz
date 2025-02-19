package api;


public class EmptyComputeEngine implements ComputeEngineAPI{
		
		
	    public ProcessJob processTheJob(ComputeUserInput generalInput) {
	    	
//	    	ProcessJob placeholderProcessJob = new ProcessJob();
	    	
	    	return new ProcessJob(){};
	    	
	}
}

//hello
//gradle stop breaking please