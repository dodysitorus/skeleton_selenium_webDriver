package org.example.Hook;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.example.Utility.DriverFactory;

public class Hook {
    @Before
    public void setUp() {
        DriverFactory.initDriver();
    }

    @After
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
