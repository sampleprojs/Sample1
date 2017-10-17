import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MathNthElementFromLastTest {

    private MathService mathService;

    @Before
    public void setup() {
        mathService = new MathService();
    }

    @Test
    public void test1() {
        Assert.assertEquals(mathService.nthNumberFromLast(new int[]{10, 20, 30, 40, 50}, 4), 20);
    }

    @Test
    public void test2() {
        Assert.assertEquals(mathService.nthNumberFromLast(new int[]{10, 20, 30, 40, 50}, 1), 50);
    }

    @Test
    public void test3() {
        Assert.assertEquals(mathService.nthNumberFromLast(new int[]{10, 20, 30, 40, 50}, 10), -1);
    }

    @Test
    public void test4() {
        Assert.assertEquals(mathService.nthNumberFromLast(new int[]{10, 20, 30, 40, 50}, 2), 40);
    }
}
