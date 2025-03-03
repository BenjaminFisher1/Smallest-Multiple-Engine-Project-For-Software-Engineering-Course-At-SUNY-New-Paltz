package api;

public class ComputeUserInput{
	
	private long value;
		
	
	
	public ComputeUserInput(long userInput){		//change later?
		 long value = userInput;
	}
	
	public ComputeUserInput(){
		 long value = 2;
	}
	
	public long getValue(){
		return this.value;
	}
	
	public void setValue(long k){
		this.value = k;
	}
	
}
