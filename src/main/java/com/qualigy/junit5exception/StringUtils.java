package com.qualigy.junit5exception;

public class StringUtils {

    public static Integer convertToInt(String str) {
        if(str == null || str.length() ==0) {
            throw new IllegalArgumentException("String value must not be null or empty");
        }
        return Integer.valueOf(str);
    }
}
