package api;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import api.ComputeEngineAPI;
import api.ComputeUserInput;
import api.ProcessJob;

public class TestComputeEngineAPI extends ComputeEngineAPI{
    @Test
    public void testComputeEngineBehvior(){
        ComputeEngineAPI engine = mock(ComputeEngineAPI.class);
        ComputeUserInput input = new ComputeUserInput();
        ProcessJob expectedJob = mock(ProcessJob.class);

        when(engine.computeUponThis(input)).thenReturn(expectedJob);

        ProcessJob result = engine.computeUponThis(input);

        assertEquals(expectedJob, result);

        verify(engine).computeUponThis(input);



    }

}
