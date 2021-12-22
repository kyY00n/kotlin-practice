class 추상클래스초기화

abstract class AbstractClass {
    abstract fun function1()
    abstract fun function2()
}

class ExtendsAbstractClass: AbstractClass() {
    override fun function1() {
        TODO("Not yet implemented")
    }

    override fun function2() {
        TODO("Not yet implemented")
    }
}

fun main(args: Array<String>) {
    val extendedClassInstance = object: AbstractClass() { // 싱글톤?
        override fun function1() {
            TODO("Not yet implemented")
        }

        override fun function2() {
            TODO("Not yet implemented")
        }
    }

    val instance2 = ExtendsAbstractClass()
}