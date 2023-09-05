package org.example;
import com.microsoft.appcenter.appium.Factory;
import com.microsoft.appcenter.appium.EnhancedAndroidDriver;
import org.junit.rules.TestWatcher;
import org.junit.Rule;

import static org.junit.Assert.*;

public class CalcTest {
    @Rule
    public TestWatcher watcher = Factory.createWatcher();

    @org.junit.Test
    public void add() {
        assertEquals(4, 2+2);
        assertEquals(3, 2+1);
    }
}