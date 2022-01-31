package kotlinInAction


open class View {
    open fun click() = println("View clicked.")
}

class Button : View() {
    // overriding => runtime (dynamic dispatch)
    override fun click() = println("Button clicked.")
}

// 확장함수 => static method => compile time
fun View.showOff() = println("I'm a view!")
fun Button.showOff() = println("I'm a button!")

fun main() {
    val view: View = Button()
    view.click() // Button clicked.
    view.showOff() // I'm a view!

    val button = Button()
    button.showOff() // I'm a button!
}
