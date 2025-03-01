package emptyimplementations;

import api.ComputeRequest;
import api.ComputeResult;
import api.Networker;

public class EmptyNetworker implements Networker{
		
		public ComputeResult compute(ComputeRequest computeRequest) {
			return new ComputeResult(){};
		}
		
    }

