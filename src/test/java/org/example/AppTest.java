package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest{
    App app = new App();
    @Test
    public void testAddMe() {
        assertEquals(300, app.addMe(200, 100));
    }
}


