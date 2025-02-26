package src;
import java.io.File;



public class RealNetworker implements Networker{
	public RealNetworker(File userFile) {			
		
		
		InputConfiguration inputConfig = new InputConfiguration() {
			
		};
		
		OutputConfiguration outputConfig = new OutputConfiguration() {
			
		};
		
		
		
		
		
		
		//pass fileName to datastorage get int put into compute request object
//		
//		ComputeRequest request = new ComputeRequest(inputConfig, outputConfig, userFile);		//create request using default delimiter ',' refer to ComputeRequest.java for more info
//
//		ComputeResult result;
		
		//TODO: return result status somehow
	}
	
	public long request()
	
//	public ComputeResult compute(ComputeRequest request) {
//		
//		RealDataStorage.addFile(request);
//
//		
//		return new ComputeResult(RealDataStorage.getComputed(request));
//		
//	}
//	
//	
//	public ComputeRequest getRequest() {
//		return this.request;
//	}
//	
	

}

