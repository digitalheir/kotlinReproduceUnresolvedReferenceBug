package com.example.reproduceunresolvedreferencebug

class SortableThing(val i: Int) : Comparable<SortableThing> {
    override fun compareTo(other: SortableThing): Int = i - other.i

    override fun toString(): String  = "[$i]"
}