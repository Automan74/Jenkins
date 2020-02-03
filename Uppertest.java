import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Uppertest {
    @BeforeAll
    static void beforeAll() {
        System.out.println("Testing Starts");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Testing is done.");
    }

    @BeforeEach
    void beforeEach(TestInfo info) {
        System.out.println("Current test " + info.getDisplayName());
    }

    @AfterEach
    void afterAll(TestInfo info) {
        System.out.println("Current test finished: " + info.getDisplayName());
    }

    @ParameterizedTest
    @DisplayName("Jämför metoden med strängen")
    @CsvSource({"qwerty, QWERTY", "asdf ,ASDF","zxcvbn ,ZXCVBN","yui, YUI","hjkl ,HJKL" })
    void upperCaseTest(String actual, String expected) {
        assertEquals(expected, actual.toUpperCase());


    }
}
