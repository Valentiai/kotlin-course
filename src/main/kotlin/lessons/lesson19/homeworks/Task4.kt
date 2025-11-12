package org.example.lessons.lesson19.homeworks

class PhrasesToListOfStrings : Mapper<String, List<String>> {
    override fun map(from: String): List<String> {
        return from.split(" ")
    }

    override fun mapList(fromList: List<String>): List<List<String>> {
        return fromList.map { map(it) }
    }
}