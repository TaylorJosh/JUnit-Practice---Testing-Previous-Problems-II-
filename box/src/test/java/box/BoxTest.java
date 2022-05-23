package box;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

@DisplayName("Test Box")
public class BoxTest {
    @Test
    @DisplayName("Test isEqual")
    public static void testisEqual() {
        Boxes box1 = new Boxes(4, 8);
        Boxes box2 = new Boxes(4, 8);
        Boxes box3 = new Boxes(8, 12);
        assertTrue(box1.isEqual(box2));
        assertFalse(box1.isEqual(box3));
    }
}