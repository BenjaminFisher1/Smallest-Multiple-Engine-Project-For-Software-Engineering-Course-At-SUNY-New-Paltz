
import api.ComputeEngineAPI;
import api.ComputeUserInput;
import api.ProcessedJob;
public class RealComputeEngine implements ComputeEngineAPI{
	public RealComputeEngine(){
		ComputeUserInput userInput = new ComputeUserInput(1);		//has value, where it says 1 put value from file
		ProcessedJob processedJob = new ProcessedJob();		//runs computation on value of userInput
	}

	
	
	public ProcessedJob computeUponThis(ComputeUserInput input) {
		long returnOutput;
		try{ //make .value method
			 returnOutput = getSmallestMult(input.getValue());
		}catch(Exception e) {
			input.setValue(1);
			 returnOutput = getSmallestMult(input.getValue());
		}
		
		ProcessedJob returnJob = new ProcessedJob(returnOutput);
		return returnJob;	
	
	}
	
	public static long getSmallestMult(long k) {
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