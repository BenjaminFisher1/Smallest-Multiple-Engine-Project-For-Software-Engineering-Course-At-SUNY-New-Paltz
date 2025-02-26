package api;

import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;


public class TestComputeEngineAPI {

    @Test
    public void testComputeEngineBehavior() {

        ComputeEngineAPI engine = mock(ComputeEngineAPI.class);
        ComputeUserInput input = new ComputeUserInput();
        ProcessedJob expectedJob = mock(ProcessedJob.class);


        when(engine.computeUponThis(input)).thenReturn(expectedJob);


        ProcessedJob result = engine.computeUponThis(input);


        assertEquals(expectedJob, result);
//        verify(engine).computeUponThis(input);
    }
}
