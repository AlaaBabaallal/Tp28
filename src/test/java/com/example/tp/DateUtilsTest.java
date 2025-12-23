package com.example.tp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DateUtilsTest {

    @Test
    void leapYear_cases() {
        assertTrue(DateUtils.isLeapYear(2400));
        assertFalse(DateUtils.isLeapYear(1700));
        assertTrue(DateUtils.isLeapYear(2024));
        assertFalse(DateUtils.isLeapYear(2019));
    }
}
