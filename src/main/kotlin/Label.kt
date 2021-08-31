class Label

fun main(args: Array<String>) {
    var x = 0
    var y = 0

    while (x <= 20) {
        y = 0
        while (y <= 20) {
            if (x + y == 15 && x - y == 5)
                break // 바깥 쪽 반복문은 빠져나갈 수 없다.
            y += 1
        }
        x += 1
    }
    println("x: $x, y: $y")

    // 이럴 때 outer label을 사용한다!
    x = 0
    y = 0
    outer@ while (x <= 20) {
        y = 0
        while (y <= 20) {
            if (x + y == 15 && x - y == 5)
                break@outer
            y += 1
        }
        x += 1
    }
    println("x: $x, y: $y")
}