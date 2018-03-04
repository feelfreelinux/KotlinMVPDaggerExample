package io.github.feelfree.kotlinmvpdaggerexample.api.mapper

interface Mapper<in T, out Y> {
    fun map(value : T) : Y
}