package api;


import project.annotations.ConceptualAPIPrototype;

@ConceptualAPIPrototype
public class ComputeEngineAPIImpl implements ComputeEngineAPI {
	ComputeAPIImpl tempComputeAPI = new ComputeAPIImpl();
    private ComputeAPI computeAPI = ;

    @Override
    public int processJob(int n) {
        return computeAPI.computeSmallestMultiple(n);
    }
}
//comment