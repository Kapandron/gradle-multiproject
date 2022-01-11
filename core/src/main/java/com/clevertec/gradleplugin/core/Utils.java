package com.clevertec.gradleplugin.core;

import static com.clevertec.gradleplugin.StringUtils;

public class Utils {

    public static boolean isAllPositiveNumbers(String... strings) {
        for (String string : strings) {
            if (!StringUtils.isPositiveNumber(string)) {
                return false;
            }
        }

        return true;
    }
}
