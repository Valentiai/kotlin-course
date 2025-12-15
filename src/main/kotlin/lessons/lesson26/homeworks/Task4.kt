package org.example.lessons.lesson26.homeworks

fun ex4() {
    File("workspace/task4/temp").apply {
        mkdirs()
        mapOf(
            "dir1" to true,
            "file1" to false,
            "dir2" to true,
            "dir3" to true,
            "file2" to false,
            "file3" to false
        ).forEach { (name, isDirectory) ->
            resolve(name).also {
                if (isDirectory) {
                    it.mkdir()
                } else {
                    it.createNewFile()
                }
            }
        }
        check(list() != null && list()!!.size == 6) { "Список файлов и директорий не полный ${list()?.joinToString()}" }
        parentFile.deleteRecursively()
    }
    check(!File("workspace/task4").exists())
}