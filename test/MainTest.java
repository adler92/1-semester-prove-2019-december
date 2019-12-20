import junit.framework.TestCase;

public class MainTest extends TestCase {


    public void testHello() {

        Main m = new Main();

        m.hello("András!");

        assertEquals("Hello András!", m.hello("András"));

    }


    public void testHelloEmptyString() {

        Main m = new Main();

        assertEquals("Hello World!", m.hello(""));
    }
}