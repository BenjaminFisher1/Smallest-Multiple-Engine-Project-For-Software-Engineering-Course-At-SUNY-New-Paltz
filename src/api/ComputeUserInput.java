package api;

import com.sun.jdi.connect.Connector;

public class ComputeUserInput{
	
	private long value;
		
	
	
	public ComputeUserInput(long userInput){
		if(userInput < 1 ){
			throw new ArgumentException("User input must be a positive number");
		}
		 value = userInput;
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
