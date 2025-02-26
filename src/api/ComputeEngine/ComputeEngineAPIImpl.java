package api;


//import project.annotations.ConceptualAPIPrototype;

//@ConceptualAPIPrototype
public class ComputeEngineAPIImpl implements ComputeEngineAPI{
	public void prototype(ComputeEngineAPI computeEngineApi) {
		ComputeUserInput generalInput = new ComputeUserInput();

	    ProcessedJob computeJob = computeEngineApi.computeUponThis(generalInput);
	    
	}
	
}	

//comment