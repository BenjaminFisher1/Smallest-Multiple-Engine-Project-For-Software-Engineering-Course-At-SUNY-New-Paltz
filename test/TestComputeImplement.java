package api;

import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestComputeImplement {
    @Test
    public void testUserInput(){
        ComputeImplement impl = mock(ComputeImplement.class);
        when(impl.userInput(0)).thenReturn(0);

        assertEquals(5,impl.userInputInt(0))
    }
}
