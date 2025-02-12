package api;


import project.annotations.ConceptualAPIPrototype;

@ConceptualAPIPrototype
public class ComputeEngineAPIImpl implements ComputeEngineAPI {
    private ComputeAPI computeAPI = new ComputeAPIImpl();

    @Override
    public int processJob(int n) {
        return computeAPI.computeSmallestMultiple(n);
    }
}
//comment