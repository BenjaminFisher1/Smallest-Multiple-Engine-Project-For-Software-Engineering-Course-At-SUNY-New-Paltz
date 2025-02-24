package api;

public class ComputeRequest{
	
		private static final char DEFAULT_DELIMITER = ',';
		
		private final InputConfiguration inputConfig;
		private final OutputConfiguration outputConfig;
		private final char delimiter;
		
		public ComputeRequest(InputConfiguration inputConfig, OutputConfiguration outputConfig) {	//no delimiter specified, we use default
			this(inputConfig, outputConfig, DEFAULT_DELIMITER);
		}
		
		public ComputeRequest(InputConfiguration inputConfig, OutputConfiguration outputConfig, char delimiter) {	//constructor for specific delimiter character
			this.inputConfig = inputConfig;
			this.outputConfig = outputConfig;
			this.delimiter = delimiter;
		}
}