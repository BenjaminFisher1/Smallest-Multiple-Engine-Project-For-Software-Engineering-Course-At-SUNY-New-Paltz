import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import org.junit.Test;

public class TestComputeEngineAPI {
    @Test
    void testComputeUponThis(){
        ComputeEngineAPI api = mock(ComputeEngineAPI.class);
        ComputeUserInput input = new ComputeUserInput();
        ProcessJob job =mock(ProcessJob.class);

        when(api.computeUponThis(input)).thenReturn(job);

        assertEquals(job,api.computeUponThis(input));
    }

}
