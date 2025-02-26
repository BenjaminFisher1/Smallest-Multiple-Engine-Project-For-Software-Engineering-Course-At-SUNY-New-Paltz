package api;

import org.checkerframework.checker.nullness.qual.NonNull;

public class DataStoreRequest{
	private int value;
	
	//request to store this data using DataStoreInput interface
	public DataStoreRequest(ComputeRequest networkerRequest) {
		this.value = 1; // TODO: this is where we will have to read from file from networkerRequest.filename
	}
	
	//dont know what this does but she had it in her example maybe it will fix 
	@NonNull
	public String toString() {
		return "";
	}
}