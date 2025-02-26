package api;

public class ProcessedJob{
	
	private long value;
	
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