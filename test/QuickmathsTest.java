import org.junit.Test;

import static org.junit.Assert.*;

public class QuickmathsTest {

    @Test
    public void testSum() {
        // TODO Din kode her
        Quickmaths x = new Quickmaths();

        assertEquals(10, x.sum(5,5));
    }

    @Test
    public void testGennemsnit() {
        // TODO Din kode her
        Quickmaths x = new Quickmaths();

        assertEquals(10, x.gennemsnit(10,10) );
    }

}