package src;

import java.util.HashMap;
import api.ComputeUserInput;
import api.ProcessedJob;
import api.DataStorage;

public class Main{
	public static void main(String[] args) {
		RealComputeEngine realComputeEngine = new RealComputeEngine();
		RealDataStorage realDataStorage = new RealDataStorage();
		RealNetworker realNetworker = new RealNetworker();
		
		String filename = "sample";
		realDataStorage.storeAll(realNetworker.getList(filename));
		
		//do all data storing BEFORE beginning calculations
		//because of this cloning of datastorage map
		HashMap<ComputeUserInput, ProcessedJob> tempMap = new HashMap<>();
		tempMap = realDataStorage.getInAndOutMap();
		for(ComputeUserInput input : tempMap.values() ) {		//for each key in hashmap of database
			realDataStorage.StoreData(input, realComputeEngine.computeUponThis(input));		//replace each pair of (input, temp val) with (input, computedInput)
		}
		
		
	}
}