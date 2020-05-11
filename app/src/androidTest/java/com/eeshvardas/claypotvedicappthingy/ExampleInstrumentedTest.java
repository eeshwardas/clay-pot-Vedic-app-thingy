//Copyright [April 2020 - present] Erik Douglas Ward (Eeshvar Das)
//Erik Douglas Ward (Eeshvar Das) is a resident of Las Vegas, NV

package com.eeshvardas.claypotvedicappthingy;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();

        assertEquals("com.eeshvardas.claypotvedicappthingy", appContext.getPackageName());
    }
}