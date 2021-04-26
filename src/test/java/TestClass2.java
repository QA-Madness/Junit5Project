import org.junit.jupiter.api.*;

public class TestClass2 extends BaseTest {

    static String className = TestClass2.class.getName();

    @BeforeAll
    static void beforeClass() {
        System.out.println(">> Before class - " + className);
    }

    @AfterAll
    static void afterClass() {
        System.out.println(">> After class - " + className);
    }

    @AfterEach
    public void afterEach() {
        System.out.println("> After test - " + className);
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("> Before test - " + className);
    }


    @Test
    public void myFirstTest() {
        System.out.println("First test - " + className);
    }

    @Test
    public void mySecondTest() {
        System.out.println("Second test - " + className);
    }
}
