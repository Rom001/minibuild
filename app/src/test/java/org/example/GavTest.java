package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class GavTest {
    
    @Test 
    void testGav() {
        Gav gav = Gav.parse("org.acme:lib-a:1.0.0");

        assertEquals("org.acme", gav.group());
        
    }

    @Test
    void parseSecondGav() {
        Gav gav = Gav.parse("org.other:lib-c:3.0.0");

        assertEquals("org.other", gav.group());
        assertEquals("lib-c", gav.artifact());
        assertEquals("3.0.0", gav.version());
}
}
