package api;

public class ProcessedJob{
	
	ProcessedJob(){
		public long value = 2;
	}
	ProcessedJob(long returnOutput){
		public long value = returnOutput;
	}
	
	public long getValue() {
		return this.value;
	}
}