package _230530;

import org.junit.jupiter.api.Test;

import static _230530.Game369.is369;
import static org.junit.jupiter.api.Assertions.*;

class Game369Test {

    @Test
    void testIs369() {
        assertEquals("*", Game369.is369(3));
        assertEquals("", Game369.is369(15));
        assertEquals("**", Game369.is369(33));
        assertEquals("***", Game369.is369(333));
    }


}