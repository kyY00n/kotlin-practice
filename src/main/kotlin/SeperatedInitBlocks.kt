class SeperatedInitBlocks

fun main(args: Array<String>) {
    val size = Size(10, 50)
    println(size.area)
}

class Size(width: Int, height: Int) {
    val width = width // 생성자의 매개변수는 1. 프로퍼티를 선언과 동시에 초기화하는 데에도 사용할 수 있다.
    val height: Int // init 블록에서 값을 할당해주면 에러가 나지 않는다.

    init {
        this.height = height // 생성자의 매개변수는 2. init블록에서 쓰일 수 있다.
    }

    val area: Int

    init { // 생성자 블록은 여러개로 나뉠 수 있다.
        area = width * height
    }
}