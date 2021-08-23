import org.junit.Assert;
import org.testng.annotations.Test;

public class TwoDigitsActionTest {

    @Test
    public void calculateTest() {
        int expectedMultiplicationResult = 8;
        double expectedDivisionResult = 0.5;
        int expectedReminderResult = 2;
        Results results = TwoDigitsAction.calculateResults(2, 4);

        Assert.assertEquals(expectedMultiplicationResult, results.getMultiplicationResult());
        Assert.assertTrue(expectedDivisionResult == results.getDivisionResult());
        Assert.assertEquals(expectedReminderResult, results.getRemainderResult());

        System.out.println("Test passed");
    }
}
