package org.pickles.submissions

import org.pickles.submissions.domain.calcInnerCorner

fun main(args: Array<String>) {
    print("三角形の1つ目の角度を入力してください。\n> ")
    var first: Float = readLine()?.toFloat() ?: 0f
    print("三角形の2つ目の角度を入力してください。\n> ")
    var second: Float = readLine()?.toFloat() ?: 0f
    var result = calcInnerCorner(first, second)
    println("三角形の残り１つの角度は${result}度です。")
}