package student;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

@DisplayName("Test Student")
public class StudentTest {
    private Student student;

    @BeforeEach
    public void setup() {
        student = new Student(1001001, "New Student",  9);
        System.out.println(student);
    }

    @Test
    @DisplayName("Test paying fees")
    public void testPayFees() {
        student.payFees(1500);
        assertEquals(1500, student.getFeesPaid());
        assertEquals(28500, student.getRemainingFees());
        
    }

    @Test
    @DisplayName("Test setting grade")
    public void testSetGrade() {
        student.setGrade(12);
        assertEquals(12, student.getGrade());
        
    }

    @Test
    @DisplayName("Test default fees")
    public void testDefaultFees() {
        assertEquals(30000, student.getFeesTotal());
        
    }

 

    @AfterEach
    public void setNull() {
        student = null;
        System.out.println(student);
    }
}
