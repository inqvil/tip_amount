package com.example.tiptime

import junit.framework.TestCase.assertEquals
import org.junit.Test
import java.text.NumberFormat

class TipCalculatorTests {
    @Test
    internal fun calculateTip_20percentNoRoundup(){
        val amount = 10.00
        val tipPercent = 20.00

        val exceptedTip = NumberFormat.getCurrencyInstance().format(2)
        val actualTip = calculateTip(amount, tipPercent, false)

        assertEquals(exceptedTip, actualTip)
    }
}