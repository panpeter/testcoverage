package com.piotrwilczek.testcoverage

import org.junit.Assert.*
import org.junit.Test

class CalculatorTest {
    @Test
    fun addition() {
        assertEquals(4, Calculator().add(2, 2))
    }
}
