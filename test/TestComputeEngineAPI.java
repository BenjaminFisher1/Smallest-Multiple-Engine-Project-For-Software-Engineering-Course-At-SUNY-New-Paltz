

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

import api.ComputeEngineAPI;
import api.ComputeUserInput;
import api.ProcessedJob;


public class TestComputeEngineAPI {

    @Test
    public void testComputeEngineBehavior() {

    	ComputeEngineAPI engine = mock(ComputeEngineAPI.class);
        ComputeUserInput input = new ComputeUserInput();
        ProcessedJob expectedJob = mock(ProcessedJob.class);


        when(ComputeEngineAPI.computeUponThis(input)).thenReturn(expectedJob);


        ProcessedJob result = ComputeEngineAPI.computeUponThis(input);


        assertEquals(expectedJob, result);
       
    }
}
