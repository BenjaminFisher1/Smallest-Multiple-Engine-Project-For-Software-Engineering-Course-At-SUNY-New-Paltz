package api;

import project.annotations.ConceptualAPI;

@ConceptualAPI
public interface ComputeEngineAPI {
	ProcessJob computeUponThis(ComputeUserInput generalInput);
}
//comment