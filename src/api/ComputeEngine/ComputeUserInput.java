package api;

public interface ComputeUserInput{
	
	private int value;
		
	public ComputeUserInput(int userInput){		//change later?
		 int value = userInput;
	}
	
	public ComputeUserInput(){
		 int value = 2;
	}
	
	public int getValue(){
		return this.value;
	}
	
}
