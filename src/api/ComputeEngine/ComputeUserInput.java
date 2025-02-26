package api;

public class ComputeUserInput implements ComputeEngineAPI{
		
	ComputeUserInput(int userInput){		//change later?
		public int value = userInput;
	}
	
	ComputeUserInput(){
		public int value = 2;
	}
	
	public int getValue() {
		return this.value;
	}
	
}
