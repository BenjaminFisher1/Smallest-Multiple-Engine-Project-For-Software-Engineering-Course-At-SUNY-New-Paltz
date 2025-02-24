package api;

public class EmptyNetworker implements Networker {
		
		public ComputeResult compute(ComputeRequest computeRequest) {
			return new ComputeResult(){};
		}
		
    }

