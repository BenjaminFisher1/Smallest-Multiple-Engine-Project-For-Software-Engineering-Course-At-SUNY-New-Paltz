package api;

public class ProcessedJob{
	
	ProcessedJob(){
		long value = 2;
	}
	ProcessedJob(long returnOutput){
		long value = returnOutput;
	}
	
	public long getValue() {
		return this.value;
	}
}