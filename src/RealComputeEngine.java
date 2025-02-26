public class RealComputeEngine implements ComputeEngineAPI{
	public RealComputeEngine(){
		ComputeUserInput userInput = new ComputeUserInput();		//has value
		ProcessedJob processedJob = new ProcessedJob();
			//runs computation on value of userInput
	}
	
	public void compute(ComputeUserInput userInput) {
		this.processedJob = this.computeUponThis(generalInput);
	}
	
}