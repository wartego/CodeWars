package kyu8;


import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class QuarterOfYearTest {

    @Test
    public void exampleTests() {
        int s = QuarterOfYear.quarterOf(2);

        Assertions.assertEquals(1,s);

    }
}
