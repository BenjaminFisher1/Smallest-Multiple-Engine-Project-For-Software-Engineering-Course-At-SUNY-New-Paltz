package src;

public class Main{
	
	public static void main(String[] args) {
		RealNetworker realNetworker = new RealNetworker("sampleInputs/sample");
		RealDataStorage realDataStorage = new RealDataStorage(realNetworker);
		RealComputeEngine realComputeEngine = new RealComputeEngine();
		
	}
}