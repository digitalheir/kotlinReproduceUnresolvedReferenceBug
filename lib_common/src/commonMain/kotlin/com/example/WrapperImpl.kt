package com.example

class WrapperImpl<T>(private val item: T) : Wrapper<T> {
    override fun toString(): String = item.toString()
}