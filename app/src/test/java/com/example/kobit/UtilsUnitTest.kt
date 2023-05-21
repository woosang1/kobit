package com.example.kobit

import com.example.kobit.utils.extension.getNumber
import com.example.kobit.utils.extension.makeComma
import com.example.kobit.utils.extension.makePrice
import com.example.kobit.utils.extension.roundData
import org.junit.Test

import org.junit.Assert.*

/**
 * Utils 디렉토리에 있는 메소드별 Unit-Test
 */
class UtilsUnitTest {
    @Test
    fun test_makePrice() {
        // given
        val number = "1234"
        // when
        val result = number.makePrice()
        //then
        assertEquals("1,234원", result)
    }

    @Test
    fun test_roundData() {
        // given
        val number = "1.78"
        // when
        val result = number.roundData()
        //then
        assertEquals("2", result)
    }

    @Test
    fun test_makeComma() {
        // given
        val number = "12345676"
        // when
        val result = number.makeComma()
        //then
        assertEquals("12,345,676", result)
    }

    @Test
    fun test_getNumber() {
        // given
        val number = "12,345,676원"
        // when
        val result = number.getNumber()
        //then
        assertEquals(12345676.toDouble(), result, 0.0)
    }
}