

//import project.annotations.ConceptualAPIPrototype;

//@ConceptualAPIPrototype
public class EmptyComputeEngine implements ComputeEngineAPI{
		
		@Override
	    public ProcessJob processTheJob(ComputeUserInput generalInput) {
	    	return new ProcessJob();
	    	
	}
}

