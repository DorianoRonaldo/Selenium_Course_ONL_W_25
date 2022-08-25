package pl.coderslab.test;

import org.junit.jupiter.api.*;

public class JunitExample {
    @Test
    public void firstTest() {
        System.out.println("first test");
    }

    @Test
    public void secondTest() {
        System.out.println("second test");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Test will be run before each test");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("Test will be run after each test");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test will be run before all");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test will be run after all");
    }
}
