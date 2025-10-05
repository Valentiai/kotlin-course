package org.example.lessons.lesson08.homeworks

fun task1(text: String): String {
    var newtext: String = text
    if ("невозможно" in newtext) {
        newtext = newtext.replace("невозможно", "совершенно точно возможно, просто требует времени")
    }
    if (text.startsWith("Kot")) {
        newtext = newtext+", но моя интуиция говорит об обратном"
    }
    if ("катастрофа" in newtext) {
        newtext = newtext.replace("катастрофа", "интересное событие")
    }
    if (newtext.endsWith("без проблем")) {
        newtext = newtext.replace("без проблем", "с парой интересных вызовов на пути")
    }
    if (" " !in newtext) {
        newtext = "Иногда," + newtext + ", но не всегда"
    }
    return newtext
}

fun task2(text: String) {
    val datetime: List<String> = text.substring(32).split(" ")
    println(datetime[0])
    println(datetime[1])
}

fun task3(text: String) {
    println("***************"+text.substring(15))
}

fun task4(text: String): String {
    val newtext: String = text.replace("@", " [at] ").replace(".", " [dot] ")
    return newtext
}

fun task5(text: String): String {
    return text.split("/").last()
}

fun task6(text: String): String {
    var abbr: String = ""
    for (i in text.split(" ")) {
        abbr+=i[0].uppercase()
    }
    return abbr
}

fun task7(text: String): String {
    var coll: String = ""
    var newtext: List<String> = text.split(" ")
    for (i in newtext) {
        coll+=i[0].uppercase()+i.substring(1).lowercase()+" "
    }
    return coll.trim()
}

fun encrypt(text: String): String {
    var newtext: List<String> = (text+" ".repeat(text.length % 2)).chunked(2)
    var res: String = ""
    for (i in newtext) {
        res+=i.reversed()
    }
    return res
}

fun decrypt(text: String): String {
    return encrypt(text)
}

fun main() {

}