package io.github.feelfree.kotlinmvpdaggerexample.base

import io.reactivex.Scheduler

// Providing schedulers by Dagger allows us to easily test presenters
interface Schedulers {
    fun mainThread() : Scheduler
    fun backgroundThread() : Scheduler
}