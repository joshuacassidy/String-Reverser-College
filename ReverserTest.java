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

    @org.junit.Test
    public void swapTestCase1() throws Exception {
        assertArrayEquals(new char [] {'a', 'b', 'c'}, reverser.swap(new char[] {'c', 'b', 'a'}, 0));
    }

    @org.junit.Test
    public void swapTestCase2() throws Exception {
        assertArrayEquals(new char [] {'a', 'b', 'c', 'd'}, reverser.swap(new char[] {'d', 'b', 'c', 'a'}, 0));
    }

    @org.junit.Test
    public void swapTestCase3() throws Exception {
        assertArrayEquals(new char [] {'e', 'b', 'c', 'd', 'a'}, reverser.swap(new char[] {'a', 'b', 'c', 'd', 'e'}, 0));
    }

    @org.junit.Test
    public void swapTestCase4() throws Exception {
        assertArrayEquals(new char [] {'a', 'c', 'b', 'd'}, reverser.swap(new char[] {'a', 'b', 'c', 'd'}, 1));
    }

    @org.junit.Test
    public void swapTestCase5() throws Exception {
        assertArrayEquals(new char [] {'a', 'b', 'c', 'd', 'e'}, reverser.swap(new char[] {'a', 'b', 'c', 'd', 'e'}, 2));
    }

}