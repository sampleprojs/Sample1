import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringFirstNonRepeatingCharTest {

    private StringService stringService;

    @Before
    public void setUp(){
        this.stringService = new StringService();
    }

    @Test
    public void testOne() {
        Assert.assertEquals(stringService.findFirstNonRepeatingChar("twitter"), 'w');
    }

    @Test
    public void testTwo() {
        Assert.assertEquals(stringService.findFirstNonRepeatingChar("array"), 'y');
    }

    @Test
    public void testThree() {
        Assert.assertEquals(stringService.findFirstNonRepeatingChar("www is big!"), 's');
    }

    @Test
    public void testFour() {
        Assert.assertEquals(stringService.findFirstNonRepeatingChar("aaa@bbb.com"), 'c');
    }
}
