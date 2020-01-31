package com.example

import com.example.Wrapper
import com.example.wrap

fun <D : Comparable<D>, T : D> sortMe(items: Array<T>): Collection<Wrapper<D>> =
    items.sortedBy { it }.map { wrap<D>(it) }