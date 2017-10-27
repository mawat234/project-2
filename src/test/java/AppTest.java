
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {
    @Test
    public void testSum()
    {
        int output=AppJ.sum(3,7);
        assertEquals(10,output);
    }

}
