import org.junit.Assert;
import org.junit.Test;


public class MainClassTest extends MainClass
{
    @Test
    public void testGetClassNumber()
    {
        int classNumber = super.getClassNumber();
        Assert.assertTrue("ClassNumber < 45",classNumber > 45 );
    }
}
