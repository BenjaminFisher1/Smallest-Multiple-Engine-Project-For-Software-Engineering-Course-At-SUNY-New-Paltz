package api;


import project.annotations.ConceptualAPIPrototype;

@ConceptualAPIPrototype
public class ComputeEngineAPIImpl implements ComputeEngineAPI {
	ComputeAPIImpl tempComputeAPI = new ComputeAPIImpl();
    public ComputeAPI computeAPI = tempComputeAPI ;

    @Override
    public void processJob(int n) {
//        return computeAPI.computeSmallestMultiple(n);
    }
}
//comment