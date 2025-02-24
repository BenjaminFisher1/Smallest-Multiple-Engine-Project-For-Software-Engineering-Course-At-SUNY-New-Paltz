package api;

import project.annotations.NetworkAPIPrototype;

@NetworkAPIPrototype
public class NetworkerPrototype{
    public void prototype(Networker networker) {
    	InputConfiguration inputConfig = new InputConfiguration() {
    		
    	};
    	
    	OutputConfiguration outputConfig = new OutputConfiguration() {
    		
    	};
    	
    	ComputeRequest request = new ComputeRequest(inputConfig, outputConfig);		//create request using default delimiter ',' refer to ComputeRequest.java for more info
   
    	ComputeResult result = networker.compute(request);
    }


}


