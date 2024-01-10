import org.testng.annotations.BeforeTest;

public class RombTest {
    Romb romb;

    @BeforeTest
    public void setUp() {
        this.romb = new Romb();
    }

    @Test
    public void testCalcArea() {
        this.romb.calcArea(30.0);
    }

}
