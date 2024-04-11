package com.yondikavl.aritmateka.models

data class QuestionSplit(
    val answer: Int,
    val first: Int,
    val operator: String,
    val questionMarkValue: String,
    val second: Int
)