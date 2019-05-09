package org.pickles.submissions.domain

fun calcInnerCorner(first: Float, second: Float): Float {

    if(first <= 0) throw IllegalArgumentException()
    if(second <= 0) throw IllegalArgumentException()
    if(first >= 180) throw IllegalArgumentException()
    if(second >= 180) throw IllegalArgumentException()

    var result: Float = 180f - first - second

    if(result > 180) throw IllegalArgumentException()

    return result
}