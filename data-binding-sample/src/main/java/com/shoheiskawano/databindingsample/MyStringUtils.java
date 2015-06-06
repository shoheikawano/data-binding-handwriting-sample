package com.shoheiskawano.databindingsample;

import android.text.TextUtils;

/**
 * custom util class imported and used in activity_main
 */
public final class MyStringUtils {
    public static String capitalize(String target) {
        return TextUtils.isEmpty(target) ? "" : target.toUpperCase();
    }
}
