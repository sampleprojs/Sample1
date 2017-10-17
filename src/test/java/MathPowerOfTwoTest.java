import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MathPowerOfTwoTest {

    private MathService mathService;

    @Before
    public void setup() {
        mathService = new MathService();
    }

    @Test
    public void testOne(){
        Assert.assertEquals(mathService.isPowerOfTwo(1), true);
    }

    @Test
    public void testZero(){
        Assert.assertEquals(mathService.isPowerOfTwo(0), false);
    }

    @Test
    public void testTrue(){
        Assert.assertEquals(mathService.isPowerOfTwo(64), true);
    }

    @Test
    public void testFalse(){
        Assert.assertEquals(mathService.isPowerOfTwo(55), false);
    }

    @Test
    public void testFalseTwo(){
        Assert.assertEquals(mathService.isPowerOfTwo(66), false);
    }

    @Test
    public void testNegative(){
        Assert.assertEquals(mathService.isPowerOfTwo(-8), true);
    }

    @Test
    public void testNegativeTwo(){
        Assert.assertEquals(mathService.isPowerOfTwo(-16), false);
    }
}
