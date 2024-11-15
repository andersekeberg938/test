package com.test.Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickMathsTest {
    QuickMaths qm = new QuickMaths();
    @Test
        void test() {
            assertEquals(40, qm.summary());
    }

}