import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

import api.ComputeUserInput;
import api.ProcessedJob;


public class TestCalculation{
	
	@Test
	public void testCalculation() {
		ComputeUserInput userInput = mock(ComputeUserInput.class);
		ProcessedJob proJob = mock(ProcessedJob.class);
		assertNotEquals(proJob.getValue(), userInput.getValue());
		
	}
	
}
