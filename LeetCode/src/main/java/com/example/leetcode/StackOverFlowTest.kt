package com.example.leetcode

/**
 * @data on 2021/7/2 6:06 下午
 * @auther
 * @describe 栈溢出：一般是递归调用中遇到，调用某个方法无法跳出递归，导致JVM的方法栈满了，报这个错。（栈帧达到了最大限制：只进栈不出栈）
 * java类写的话，需要进行额外配置，直接转成kotlin方便检测
 */
class StackOverFlowTest {
    fun stackOverFlow() {
        stackOverFlow()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val s = StackOverFlowTest()
            s.stackOverFlow()
        }
    }
}