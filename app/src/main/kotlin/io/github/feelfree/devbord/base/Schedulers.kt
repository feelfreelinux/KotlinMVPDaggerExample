package io.github.feelfree.devbord.base

import io.reactivex.Scheduler

// Providing schedulers by Dagger allows us to easily test presenters
interface Schedulers {
    fun mainThread() : Scheduler
    fun backgroundThread() : Scheduler
}