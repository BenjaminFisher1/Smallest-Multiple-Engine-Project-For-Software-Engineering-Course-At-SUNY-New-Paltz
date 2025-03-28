
import api.ComputeResult;

import java.io.File;


public class TestUser {
	
	// TODO 3: change the type of this variable to the name you're using for your
	// @NetworkAPI interface; also update the parameter passed to the constructor
	private final ComputeResult coordinator;

	public TestUser(ComputeResult coordinator) {
		this.coordinator = coordinator;
	}

	public void run(String outputPath) {
		char delimiter = ';';
		String inputPath = "test" + File.separatorChar + "testInputFile.test";
		
		// TODO 4: Call the appropriate method(s) on the coordinator to get it to
		coordinator.processFile(inputPath, outputPath, delimiter);
		// run the compute job specified by inputPath, outputPath, and delimiter
	}

}
