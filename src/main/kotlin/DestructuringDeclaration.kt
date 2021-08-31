class DestructuringDeclaration
fun main(args: Array<String>) {
    data class Saved(val a : Int, val b : Int)

    fun 함수() : Saved {
        return Saved(10, 20)
    }

    val (a,b) = 함수() // 객체를 반환.
    println(a)
    print(b)
}