import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    static String className = BaseTest.class.getName();

    @BeforeAll
    static void beforeAll() {
        System.out.println(">>> Before all - " + className);
    }

    @AfterAll
    static void afterAll() {
        System.out.println(">>> After all - " + className);
    }

    @BeforeEach
    public void beforeEachTest() {
        System.out.println(">>> Before each test - " + className);
    }

    @AfterEach
    public void afterEachTest() {
        System.out.println(">>> After each test - " + className);
    }
}
