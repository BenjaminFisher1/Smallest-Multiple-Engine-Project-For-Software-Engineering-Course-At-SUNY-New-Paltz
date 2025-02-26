package api;

public class ComputeRequest{
	
		private static final char DEFAULT_DELIMITER = ',';
		
		private final InputConfiguration inputConfig;
		private final OutputConfiguration outputConfig;
		private final File userFile;
		private final char delimiter;
		
		public ComputeRequest(InputConfiguration inputConfig, OutputConfiguration outputConfig, File userFile) {	//no delimiter specified, we use default
			this(inputConfig, outputConfig, userFile, DEFAULT_DELIMITER);
		}
		
		public ComputeRequest(InputConfiguration inputConfig, OutputConfiguration outputConfig, File userFile, char delimiter) {	//constructor for specific delimiter character
			this.inputConfig = inputConfig;
			this.outputConfig = outputConfig;
			this.userFile = userFile;
			this.delimiter = delimiter;
		
		}
}