package kotlinInAction

class BackingProperties(
    value: String
) {
    private var strVar: String = value

    val publicStrVal: String
        get() = strVar

    var mutableBackingProperty: String // 변경가능한 backing property
        get() = strVar
        set(value: String) { // ㅜ 이게 무슨의미가 있을깡?.. 누가 좀 알려줘
            // 알려 주셨다. https://stackoverflow.com/a/64582494
            updateStrVar(value)
        }

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