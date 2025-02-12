package api;


import project.annotations.ConceptualAPIPrototype;

@ConceptualAPIPrototype
public class ComputeEngineAPIImpl implements ComputeEngineAPI {
	ComputeUserInput generalInput = new ComputeUserInput();
    public ComputeAPI computeAPI = tempComputeAPI ;

    ProcessJob computeJob = computeAPI.computeUponThis(generalInput);
    
}

//comment