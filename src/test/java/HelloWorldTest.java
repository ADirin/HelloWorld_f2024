import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
    HelloWorld helloWorld = new HelloWorld();
    @Test
    public void testGetMessage() {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals("Hello, World!", helloWorld.getMessage());
    }
}
