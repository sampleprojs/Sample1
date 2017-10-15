import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MathPowerTest {
    private MathService mathService;

    @Before
    public void setup() {
        mathService = new MathService();
    }

    @Test
    public void testPowerNormal(){
        Assert.assertEquals(mathService.power(2,3), 8.0f, 0.001);
    }

    @Test
    public void testPowerZero(){
        Assert.assertEquals(mathService.power(2,0), 1.0f, 0.001);
    }

    @Test
    public void testPowerOne(){
        Assert.assertEquals(mathService.power(2,1), 2.0f, 0.001);
    }

    @Test
    public void testPowerNegatives2(){
        Assert.assertEquals(mathService.power(-2,3), -8.0f, 0.001);
    }

    @Test
    public void testPowerNegatives(){
        Assert.assertEquals(mathService.power(2,-3), 0.125, 0.001);
    }

}
