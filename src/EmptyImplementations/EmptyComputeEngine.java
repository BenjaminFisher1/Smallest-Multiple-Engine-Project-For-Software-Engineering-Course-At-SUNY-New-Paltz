package EmptyImplementations;


//import project.annotations.ConceptualAPIPrototype;

//@ConceptualAPIPrototype
public class EmptyComputeEngine implements ComputeEngineAPI{
		
	    public ProcessJob processTheJob(ComputeUserInput generalInput) {
	    	return new ProcessJob();
	    	
	}
}

