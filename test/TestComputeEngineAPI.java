package api;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito;

public class TestComputeEngineAPI {

    @Test
    public void testComputeEngineBehavior() {

        ComputeEngineAPI engine = mock(ComputeEngineAPI.class);
        ComputeUserInput input = new ComputeUserInput();
        ProcessJob expectedJob = mock(ProcessJob.class);


        when(engine.computeUponThis(input)).thenReturn(expectedJob);


        ProcessJob result = engine.computeUponThis(input);


        assertEquals(expectedJob, result);
        verify(engine).computeUponThis(input);
    }
}
