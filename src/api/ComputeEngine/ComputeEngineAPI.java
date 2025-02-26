package api;

import project.annotations.ConceptualAPI;

@ConceptualAPI
public interface ComputeEngineAPI {
	ProcessedJob computeUponThis(ComputeUserInput generalInput);
	
	public static ProcessedJob computeUponThis(ComputeUserInput input) {
		
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
