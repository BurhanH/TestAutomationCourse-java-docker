import org.junit.jupiter.api.*;

public class Tests {
    @Test
    public void test1 () {
        Assertions.assertEquals(1, 1);
    }
    @Test
    public void test2 () {
        Assertions.assertEquals('a', 'a');
    }
    @Test
    public void test3 () {
        Assertions.assertEquals(24,24);
    }
    @Test
    public void test4 () {
        Assertions.assertNotEquals(1,3);
    }
    @Test
    public void test5 () {
        Assertions.assertNotEquals('c', 'a');
    }
}
