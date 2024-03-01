package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest{
    App app = new App();
    @Test
    public void testAddMe() {
        assertEquals(300, app.addMe(200, 100));
    }
}


