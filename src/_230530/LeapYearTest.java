package _230530;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeapYearTest {

    @org.junit.jupiter.api.Test
    void checkLeapYear() {
        assertEquals(false, LeapYear.checkLeapYear(1700));
    }
}