class ConstructorAndInitializer
fun main(args: Array<String>) {
    val person = Person("윤가영", 22)
    println("이름: ${person.name}")
    println("나이: ${person.age}")
}

class Person constructor(name: String, age: Int) {
    val name: String
    val age: Int

    init {  // 생성자를 호출하면 init 블록이 실행되며 프로퍼티에 자동으로 값이 채워진다.
        this.name = name
        this.age = age
    }

}