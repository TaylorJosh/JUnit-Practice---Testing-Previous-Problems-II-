package teacher;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

@DisplayName("Test Teacher")
public class TeacherTest {
    private Teacher teacher;

    @BeforeEach
    public void setup() {
        teacher = new Teacher(999, "Jane Doe", 10000);
    }

    @Test
    @DisplayName("Test constructor")
    public void testConstructor() {
        assertEquals(999, teacher.getId());
        assertEquals("Jane Doe", teacher.getName());
        assertEquals(10000, teacher.getSalary());
    }
}
