package api;

public class RealComputeEngine implements ComputeEngineAPI{
	public RealComputeEngine(){
		ComputeUserInput userInput = new ComputeUserInput();		//has value
		ProcessedJob processedJob = new ProcessedJob();
			//runs computation on value of userInput
	}
	
	public ProcessedJob compute(ComputeUserInput userInput) {
		return new processedJob() = this.computeUponThis(userInput);		//returns a processed job carrying value of computed data	
	}
	
}