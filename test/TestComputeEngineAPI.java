package api;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals; //  Correct import for JUnit 5
import static org.mockito.Mockito.*; //  Import all Mockito functions

public class TestComputeEngineAPI {

    @Test
    public void testComputeEngineBehavior() {
        // Mock the ComputeEngineAPI
        ComputeEngineAPI engine = mock(ComputeEngineAPI.class);
        ComputeUserInput input = new ComputeUserInput();
        ProcessJob expectedJob = mock(ProcessJob.class);

        // Define behavior of mocked API
        when(engine.computeUponThis(input)).thenReturn(expectedJob);

        // Call the method
        ProcessJob result = engine.computeUponThis(input);

        // Assertions
        assertEquals(expectedJob, result);
        verify(engine).computeUponThis(input);
    }
}
