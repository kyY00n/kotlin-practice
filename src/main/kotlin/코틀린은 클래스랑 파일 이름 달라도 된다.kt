public class `코틀린은 클래스랑 파일 이름 달라도 된다` {
    val name = "코틀린은 클래스랑 파일 이름 달라도 된다"

    override fun toString(): String {
        return this.name
    }
}

public class `코틀린은 public 클래스 여러 개여도 된다` {
    val name = "코틀린은 public 클래스 여러 개여도 된다"

    override fun toString(): String {
        return this.name
    }
}

fun main(args: Array<String>) {
    val class1 = `코틀린은 클래스랑 파일 이름 달라도 된다`()
    val class2 = `코틀린은 public 클래스 여러 개여도 된다`()
    println(class1.toString())
    println(class2.toString())
}