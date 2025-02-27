

import java.io.IOException;

import api.ComputeRequest;
import api.ComputeResult;

public class Main{
	public static void main(String[] args) throws IOException {
		
		RealNetworker realNetworker = new RealNetworker();
		
		String filename = "sample";
		ComputeRequest localRequest = new ComputeRequest(filename);
		ComputeResult localResult;
		localResult = realNetworker.compute(localRequest);
		
		
		
		
		//do all data storing BEFORE beginning calculations
		//because of this cloning of data storage  map
		
		
		
	}
}