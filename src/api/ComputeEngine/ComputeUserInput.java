package api;

public class ComputeUserInput implements ComputeEngineAPI{
	
	private int value;
		
	ComputeUserInput(int userInput){		//change later?
		 int value = userInput;
	}
	
	ComputeUserInput(){
		 int value = 2;
	}
	
	public int getValue(){
		return this.value;
	}
	
}
