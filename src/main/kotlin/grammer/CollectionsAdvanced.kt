import java.util.*

class CollectionsMethods

fun main(args: Array<String>) {
    val list = mutableListOf<CollectionItem>().apply {
        for (i in 0 until 1000) {
            add(CollectionItem())
        }
    }

    val filtered: List<CollectionItem> = list.filter { it.value <= 500 }

    val mapped: List<String> = list.map { it.name }

    val reduced: Int = list
        .map { it.value }
        .reduce { acc, value -> acc + value }

    val sorted: List<CollectionItem> = list.sortedBy { it.value }

    val chained: List<Int> = list
        .filter { it.value >= 500 }
        .sortedBy { it.name }
        .map { it.value }
}

class CollectionItem(
    val value: Int = Random().nextInt(1000),
    val name: String = UUID.randomUUID().toString()
) {
    override fun toString(): String {
        return "value = $value, name = $name"
    }
}