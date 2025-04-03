package api;

public class ProcessedJob{
	
	private long value;
	
	public ProcessedJob(){
		long value = 2;
	}
	public ProcessedJob(long returnOutput){
		this.value = returnOutput;
	}
	
	public long getValue() {
		return this.value;
	}
}