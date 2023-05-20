package com.example.kobit.utils.extension

import android.content.res.Resources
import java.text.DecimalFormat
import kotlin.math.roundToInt

/**
 * Dp값을 PX로 변환
 */
fun Int.dpToPixel(): Int =
    (this * Resources.getSystem().displayMetrics.density).toInt()

/**
 * 쉼표 추가 및 원 추가
 * [input]
 * 1234
 *
 * [output]
 * 1,234원
 */
fun String.makePrice() : String {
    // 숫자로 변환 가능한지 확인
    val number = toDoubleOrNull()
    if (number != null) {
        val integerFormat = DecimalFormat("#,###")
        val decimalFormat = DecimalFormat("#.##")
        // 100 초과 시, 정수 / 아닌 경우는 소수점 2자리 표시
        return if (number > 100) {
            integerFormat.format(number.toInt()) + "원"
        } else {
            decimalFormat.format(number) + "원"
        }
    } else {
        // 숫자가 아닌 경우 그대로 반환
        return this
    }
}

/**
 * 소수점 반올림.
 * [input]
 * 1.54
 *
 * [output]
 * 2
 */
fun String.roundData(): String{
    return this.toDoubleOrNull()?.let {
        it.roundToInt().toString()
    } ?: ""
}

/**
 * 쉼표 추가
 * [input]
 * 1234
 *
 * [output]
 * 1,234
 */
fun String.makeComma() : String {
    // 숫자로 변환 가능한지 확인
    val number = toDoubleOrNull()
    if (number != null) {
        // 숫자인 경우 형식화
        val decimal = DecimalFormat("#,###")
        return decimal.format(number)
    } else {
        // 숫자가 아닌 경우 그대로 반환
        return this
    }
}