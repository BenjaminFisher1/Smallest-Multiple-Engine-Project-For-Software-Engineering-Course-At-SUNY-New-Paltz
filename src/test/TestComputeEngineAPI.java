import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import org.junit.Test;

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
