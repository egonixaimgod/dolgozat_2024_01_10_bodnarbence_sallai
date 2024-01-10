import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lan.zold.Romb;

public class RombTest {
    Romb romb;

    @BeforeTest
    public void setUp() {
        this.romb = new Romb();
    }

    @Test
    public void testCalcArea() {
        double actual = this.romb.calcArea(30.0, 70);
        double expected = 696.501613402;
        Assert.assertEquals(actual, expected, 0.1);
    }

    @Test
    public void testCalcCircumference() {
        double actual = this.romb.calcCircumference(30.0);
        double expected = 120;
        Assert.assertEquals(actual, expected, 0.1);
    }

}
