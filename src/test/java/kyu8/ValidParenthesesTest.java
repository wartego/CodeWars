package kyu8;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidParenthesesTest {
    @Test
    public void sampleTest() {
        // assertEquals("expected", "actual");
        assertTrue(ValidParentheses.validParentheses("()"));
        assertFalse(ValidParentheses.validParentheses("())"));
        assertTrue(ValidParentheses.validParentheses("32423(sgsdg)"));
        assertFalse(ValidParentheses.validParentheses("(dsgdsg))2432"));
        assertTrue(ValidParentheses.validParentheses("adasdasfa"));
    }
}
