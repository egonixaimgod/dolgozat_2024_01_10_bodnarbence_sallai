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
        this.romb.calcArea(30.0, 70);
    }

    @Test
    public void testCalcCircumference() {
        this.romb.calcCircumference(30.0);
    }

}
