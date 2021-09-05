class 보조생성자

class Time(val second: Int) {
    init {
        println("init 블록 실행 중")
    }

    constructor(minute: Int, second: Int) : this(minute * 60 + second) { // this로 호출하고 있기 때문에 주생성자를 반드시 먼저 호출.
        println("보조 생성자 1 실행 중")
    }

    constructor(hour: Int, minute: Int, second: Int) : this(hour * 60 + minute, second) {
        println("보조 생성자 2 실행 중")
    }

    init {
        println("또 다른 init 블록 실행 중")
    }
}

fun main(args: Array<String>) {
    println("${Time(15, 6).second}초")
    println("${Time(6, 3, 17).second}초")
}

/* 결 (주생성자 호출 -> init 블록 -> 보조 생성자 호출)

init 블록 실행 중
또 다른 init 블록 실행 중
보조 생성자 1 실행 중
906초
init 블록 실행 중
또 다른 init 블록 실행 중
보조 생성자 1 실행 중
보조 생성자 2 실행 중
21797초

* */