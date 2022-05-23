package takeabreak;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void getBreakResponseTest()
    {
        assertEquals( "Okay. Let's keep going!", TakeABreak.getBreakResponse("yes"));
    }
}
