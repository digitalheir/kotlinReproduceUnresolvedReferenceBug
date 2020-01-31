package com.example

fun <T> wrap(it: T): Wrapper<T> = WrapperImpl(it)

fun <D : Comparable<D>, T : D> sortMe(items: Collection<T>): Collection<Wrapper<D>> =
    items.sortedBy { it }.map { wrap<D>(it) }
