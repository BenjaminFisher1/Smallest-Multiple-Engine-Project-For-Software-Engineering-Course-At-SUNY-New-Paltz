public class RealComputeEngine implements ComputeEngineAPI{
	public RealComputeEngine(){
		ComputeUserInput userInput = new ComputeUserInput();		//has value
		
		ProcessedJob processJob = this.computeUponThis(userInput);	//runs computation on value of userInput
	}
	
}