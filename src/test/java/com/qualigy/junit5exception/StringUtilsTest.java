package com.qualigy.junit5exception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringUtilsTest {

    @Test
    public void testConvertToIntNullParameterAssertThrows() {
        String str =null;
        assertThrows(IllegalArgumentException.class, () -> StringUtils.convertToInt(str));
    }
}
