package kotlinInAction

class BackingProperties(
    value: String
) {
    private var strVar: String = value

    val publicStrVal: String
        get() = strVar

    fun updateStrVar(newStr: String) {
        strVar = newStr
    }
}

fun main(args: Array<String>) {
    val clazz = BackingProperties("hello world")
    println(clazz.publicStrVal) // hello world
    clazz.updateStrVar("hello new world")
    println(clazz.publicStrVal) // hello new world
}