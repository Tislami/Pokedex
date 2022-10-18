package com.zeroone.osesturkiye.utils

fun eMailValidation(value:String): Boolean{
    return value.isNotEmpty() && value.isNotBlank()
}

fun passwordValidation(value:String): Boolean{
    return value.length>6 && value.isNotEmpty() && value.isNotBlank()
}

fun nameValidation(value:String): Boolean{
    return value.isNotEmpty() && value.isNotBlank()
}

fun lastValidation(value:String): Boolean{
    return value.isNotEmpty() && value.isNotBlank()
}

fun displayValidation(value:String): Boolean{
    return value.isNotEmpty() && value.isNotBlank()
}