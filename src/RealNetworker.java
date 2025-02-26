package src;
import java.io.File;



public class RealNetworker implements Networker{
	public RealNetworker(string filePath) {				//can have realdata and real compute here if we need to reuse objects
		
//		RealDataStorage realDataStorage = new RealDataStorage();			to initialize empty or not to initialize empty ? 
//		RealComputeEngine realComputeEngine = new RealComputeEngine();		that is the question.
		
		InputConfiguration inputConfig = new InputConfiguration() {
			
		};
		
		OutputConfiguration outputConfig = new OutputConfiguration() {
			
		};
		
		File userFile = new File(filePath);
		
		
		//pass fileName to datastorage get int put into compute request object
		
		ComputeRequest request = new ComputeRequest(inputConfig, outputConfig, userFile);		//create request using default delimiter ',' refer to ComputeRequest.java for more info

		ComputeResult result;
		
		//TODO: return result status somehow
	}
	
	
	public ComputeResult compute(ComputeRequest request) {
		
		RealDataStorage.addFile(request);

		
		return new ComputeResult(RealDataStorage.getComputed(request));
		
	}
	
	public ComputeRequest getRequest() {
		return this.request;
	}
	
	

}

