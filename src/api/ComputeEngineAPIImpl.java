package api;


import project.annotations.ConceptualAPIPrototype;

@ConceptualAPIPrototype
public class ComputeEngineAPIImpl implements ComputeEngineAPI {
	public void prototype(ComputeEngineAPI computeEngineApi) {
		ComputeUserInput generalInput = new ComputeUserInput();

	    ProcessJob computeJob = computeAPI.computeUponThis(generalInput);
	    
	}
	
}

//comment