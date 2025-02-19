package api;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*; // Import missing Mockito methods

public class TestComputeEngineAPI {

    @Test
    public void testComputeEngineBehavior() {  // Fixed typo in method name
        // Arrange
        ComputeEngineAPI engine = mock(ComputeEngineAPI.class);
        ComputeUserInput input = new ComputeUserInput();
        ProcessJob expectedJob = mock(ProcessJob.class);

        when(engine.computeUponThis(input)).thenReturn(expectedJob);

        // Act
        ProcessJob result = engine.computeUponThis(input);

        // Assert
        assertEquals(expectedJob, result);
        verify(engine).computeUponThis(input); // Verify method call
    }
}

