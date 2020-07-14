//©Erik Douglas Ward (Eeshvar Das) [April 2020 - present]
//Erik Douglas Ward (Eeshvar Das) is a resident of Las Vegas, NV

package com.eeshvardas;

import android.content.res.Resources;

import com.eeshvardas.claypotvedicappthingy.R;

final class ThrowException {
    static void Initialization() {
        Resources resources = Resources.getSystem();
        String exceptionString = resources.getString(R.string.initialization_needs_testing);
        throw new ExceptionInInitializerError(exceptionString);
    }
}
