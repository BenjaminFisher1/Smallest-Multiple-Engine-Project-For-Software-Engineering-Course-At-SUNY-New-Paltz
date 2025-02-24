package api;

import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestNetworker {
    @Test
    public void testUserInput(){
        Networker networker = mock(Networker.class);
        when(networker.userInputInt(0)).thenReturn(0);

        assertEquals(0,networker.userInputInt(0));
    }
}
