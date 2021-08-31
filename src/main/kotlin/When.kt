import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.nio.Buffer
import java.util.*

class When

fun main(args: Array<String>): Unit {
    fun grade(score: Int): Char {
        return when (score/10) {
            6 -> 'D'
            7 -> 'C'
            8 -> 'B'
            9, 10 -> 'A'
            else -> 'F'
        }
    }
    val sc = Scanner(System.`in`)
    val score = sc.nextInt()
    println(grade(score))

    // 코틀린에서는 버퍼 이렇게 쓴다! 자바랑 똑같음 ^_^
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bufferScore = Integer.parseInt(br.readLine())
    println(grade(bufferScore))
}