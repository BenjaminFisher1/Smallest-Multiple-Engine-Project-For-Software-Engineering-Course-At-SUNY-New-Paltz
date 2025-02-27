package src;
public class Main{
	public static void main(String[] args) {
		RealComputeEngine realComputeEngine = new RealComputeEngine();
		RealDataStorage realDataStorage = new RealDataStorage();
		RealNetworker realNetworker = new RealNetworker();
		
		String filename = "sample";
		realDataStorage.storeAll(realNetworker.getList(filename));
		
	}
}