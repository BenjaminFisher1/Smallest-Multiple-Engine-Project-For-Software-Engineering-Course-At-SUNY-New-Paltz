package api;

import project.annotations.ConceptualAPIPrototype;

@ConceptualAPIPrototype
public class ComputeEngAPIImplement implements ComputeImplement, ComputeEngApiImpInterface {

    @Override
    public int userInputInt(int n) {
        return 0;
    }

    private ComputeAPI computeAPI = new ComputeEngineAPI() {
        @Override
        public int processJob(int n) {
            return 0;
        }
    };

    @Override
    public int processJobs(int n){
        return computeAPI.computeSmallestMultiple(n);
    }
}
