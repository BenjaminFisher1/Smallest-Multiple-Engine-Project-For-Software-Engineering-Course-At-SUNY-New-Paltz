package src;

import java.io.File;

public class Main{
	
	public static void main(String[] args) {
		
		File userFile = new File("sampleInputs/sample");
		
		RealNetworker realNetworker = new RealNetworker(userFile);
		RealDataStorage realDataStorage = new RealDataStorage(realNetworker);
		RealComputeEngine realComputeEngine = new RealComputeEngine();
		realNetworker.
		
	}
}