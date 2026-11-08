package org.example.lessons.lesson17.homeworks

abstract class BaseClass(
    // 1. В ChildrenClass используется одноимённое поле, но оно не является полем privateVal из BaseClass
    private val privateVal: String,
    // 2. Поля protected доступны только в самом классе и в классах наследниках
    protected val protectedVal: String,
    val publicVal: String
) {
    var publicField = "3. измени меня из функции main() на Антонио Бандераса и проверь через функцию getAll()" +
            "4. Доработай ChildrenClass таким образом, чтобы это получилось"
        set(value) {
            if (verifyPublicField(value)) {
                field = value
            }
        }
    protected var protectedField = "5. измени меня из функции main() через сеттер в наследнике"
    private var privateField = "6. нельзя изменить это поле из класса наследника"
    fun getAll(): String {
        return mapOf(
            "privateVal" to privateVal,
            "protectedVal" to protectedVal,
            "publicVal" to publicVal,
            "publicField" to publicField,
            "protectedField" to protectedField,
            "privateField" to privateField,
            "generate" to generate(),
        ).map { "${it.key}: ${it.value}" }
            .joinToString("\n")
    }
    fun printText() {
        privatePrint()
    }
    // 7. Потому как она возвращает protected класс, а доступ к нему есть только из текущего класса
    // и класса наследника. Значит вне классов доступа к ней быть не может
    protected open fun getProtectedClass() = ProtectedClass()
    protected open fun verifyPublicField(value: String): Boolean {
        return value.length < 3
    }
    // 8. Потому как в дочернем классе откуда вызывается getAll() функция generate() переопределена и вызывается именно
    // переопределённая функция а не родительская
    open fun generate(): String {
        return "Это генерация из родительского класса"
    }
    private fun privatePrint() {
        println("Печать privatePrint из класса BaseClass")
    }
    // 9. Потому как она возвращает приватный класс, который может быть виден только из текущего класса
    private fun getPrivateClass() = PrivateClass()
    protected class ProtectedClass() {}
    private class PrivateClass() {}
}
class ChildrenClass(
    val privateVal: String,
    protectedVal: String,
    // 10. потому как в наследуемом классе есть одноимённое публичное поле и доступно именно оно а не этот аргумент
    publicVal: String
) : BaseClass(privateVal, protectedVal, privateVal) {
    // 11. Функция getAll() доступна благодаря наследованию
    // 12. приватные функции и поля не переопрделяются так как их область видимости только внутри класса,
    // таким образом в текущем классе это просто одноимённая функция
    private fun privatePrint() {
        println("Печать privatePrint из класса ChildrenClass")
    }
    override fun generate(): String {
        return "Это генерация из дочернего класса"
    }
    // 4. Для доработки нужно изменить поведение функции проверки фразы
    override fun verifyPublicField(value: String): Boolean {
        return true
    }
    // 5. Для решения добавляем новый метод который может изменять protected переменную изнутри класса наследника
    fun updateProtectedField(value: String) {
        protectedField = value
    }
}

fun main() {
    val children = ChildrenClass("privateVal", "protectedVal", "publicVal")
    // 3.
    children.publicField = "Антонио Бандерас"
    // 5
    children.updateProtectedField("Новое значение ProtectedField")
    println(children.getAll())
}