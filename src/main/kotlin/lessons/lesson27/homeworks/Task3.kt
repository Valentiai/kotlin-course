package org.example.lessons.lesson27.homeworks

fun test(fnc: () -> Unit): Status {
    return try {
        fnc()
        Status.PASSED
    } catch (e: AssertionError) {
        Status.FAILED
    } catch (e: Throwable) {
        Status.BROKEN
    }
}