import api.ComputeEngineAPI;
import api.ComputeUserInput;
import api.ProcessedJob;
public class RealComputeEngine implements ComputeEngineAPI{
	public RealComputeEngine(){
		ComputeUserInput userInput = new ComputeUserInput();		//has value
		ProcessedJob processedJob = new ProcessedJob();		//runs computation on value of userInput
	}

	
	
	public ProcessedJob computeUponThis(ComputeUserInput input) {
		
		long returnOutput = getSmallestMult(input.getValue()); //make .value method
		
		ProcessedJob returnJob = new ProcessedJob(returnOutput);
		return returnJob;	
	
	}
	
	public static long getSmallestMult(int k) {
		long n = Long.valueOf(k);
		long smallMult = 1;
		long i = 1;
		while(i <= n) {
			smallMult = (smallMult * i)/greatestCommonDenom(smallMult, i);
            i++;
		}
		return smallMult;
	}
	
	public static long greatestCommonDenom(long x, long y) {
		if(y == 0) {
			return x;
		} else {
			return greatestCommonDenom(y, x % y);
		}
	}
	
}