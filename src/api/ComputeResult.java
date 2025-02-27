package api;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ComputeResult {
	private File resultsFile;
	public ComputeResult(File fromDataStorage) {
		this.resultsFile = fromDataStorage;
	}
	
	public ComputeResult() {
		
	}
}
	

	