//Copyright [April 2020 - present] Erik Douglas Ward (Eeshvar Das)
//Erik Douglas Ward (Eeshvar Das) is a resident of Las Vegas, NV

package com.eeshvardas.claypotvedicappthingy;

import com.eeshvardas.offlinedatastorage.NativeAndroidR;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 1 + 3);
    }

    @Test
    public void initializeOfflineDataStorage_isInitializedCorrectly() { assertEquals(true, new NativeAndroidR() }
}