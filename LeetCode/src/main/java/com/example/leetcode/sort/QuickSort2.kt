package com.example.leetcode.sort

/**
 * @data on 2021/7/9 11:37 上午
 * @auther
 * @describe kotlin版快排
 */
class QuickSort2 {
    fun <T : Comparable<T>> List<T>.quickSort(): List<T> {
        return when {
            count() <= 1 ->
                this
            else ->
                takeLast(lastIndex)
                    .partition { it < first() }
                    .run { first.quickSort() + first() + second.quickSort() }

        }
    }

    fun main() {
        val result = listOf(3, 5, 7, 8, 1, 2).quickSort()
        println(result.toString())
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val qs = QuickSort2()
            qs.main()
        }
    }
}