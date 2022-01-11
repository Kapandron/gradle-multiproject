package com.clevertec.gradleplugin.api;

import com.clevertec.gradleplugin.core.Utils;

public class App {

    private static final String EMPTY_STRING = "";
    private static final String NOT_PREFIX = "Not ";

    public static void main(String[] args) {
        boolean result = Utils.isAllPositiveNumbers("12", "79");

        System.out.println(interpretResult(result) + "All positive numbers have been passed");
    }

    private static String interpretResult(boolean result) {
        return result
                ? EMPTY_STRING
                : NOT_PREFIX;
    }

}
