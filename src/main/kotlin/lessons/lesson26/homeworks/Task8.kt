package org.example.lessons.lesson26.homeworks

fun ex8() {
    File("workspace/task8").deleteRecursively()
    listOf(
        "workspace/task8/data/1/4/prod/data14.mysql",
        "workspace/task8/data/2/3/prod/data23.mysql",
        "workspace/task8/data/5/2/prod/data52.mysql",
    ).forEach {
        File(it).apply {
            parentFile?.mkdirs()
        }.createNewFile()
    }
    val backup = File("workspace/task8/backup").also { it.mkdirs() }
    File("workspace/task8/data").apply {
        walk().filter { it.isFile }
            .forEach {
                val relative = it.relativeTo(this)
                it.copyTo(backup.resolve(relative))
            }
    }
}