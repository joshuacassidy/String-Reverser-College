import static org.junit.Assert.*;

public class ReverserTest {

    private Reverser reverser;

    @org.junit.Before
    public void setUp() throws Exception {
        reverser = new Reverser();
    }

    @org.junit.Test
    public void reverseTestCase1() throws Exception {
        assertEquals("", reverser.reverse(""));
    }

    @org.junit.Test
    public void reverseTestCase2() throws Exception {
        assertEquals("1", reverser.reverse("1"));
    }

    @org.junit.Test
    public void reverseTestCase3() throws Exception {
        assertEquals("11",  reverser.reverse("11"));
    }

    @org.junit.Test
    public void reverseTestCase4() throws Exception {
        assertEquals("12",  reverser.reverse("21"));
    }

    @org.junit.Test
    public void reverseTestCase5() throws Exception {
        assertEquals("saw",  reverser.reverse("was"));
    }

    @org.junit.Test
    public void reverseTestCase6() throws Exception {
        assertEquals("siht",  reverser.reverse("this"));
    }

    @org.junit.Test
    public void reverseTestCase7() throws Exception {
        assertEquals("auhsoj",  reverser.reverse("joshua"));
    }
    

}