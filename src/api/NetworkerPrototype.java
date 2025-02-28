package api;

import java.io.IOException;

import project.annotations.NetworkAPIPrototype;

@NetworkAPIPrototype
public class NetworkerPrototype implements Networker{
    public void prototype(Networker networker) {
    	InputConfiguration inputConfig = new InputConfiguration() {
    		
    	};
    	
    	OutputConfiguration outputConfig = new OutputConfiguration() {
    		
    	};
    	
//    	ComputeRequest request = new ComputeRequest(inputConfig, outputConfig);		//create request using default delimiter ',' refer to ComputeRequest.java for more info
//   
//    	ComputeResult result = networker.compute(request);
    }

	@Override
	public ComputeResult compute(ComputeRequest request) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}


}


