package collection

import java.time.LocalDateTime
import java.util.*
import kotlin.Comparator

class PriorityQueuePractice

fun main(args: Array<String>) {
    val queue = PriorityQueue<EventElement>()
    val standard = LocalDateTime.now()
    val e1 = EventElement("I'm first event!", standard.minusDays(1))
    val e2 = EventElement("I'm second event!", standard)
    val e3 = EventElement("third", standard.plusDays(12))
    queue.add(e2)
    queue.add(e1)
    queue.add(e3)
    while (!queue.isEmpty()) {
        val e = queue.remove()
        println(e.event)
    }
}

data class EventElement(
    val event: String,
    val publishesAfter: LocalDateTime
): Comparable<EventElement> {
    override fun compareTo(other: EventElement): Int {
        return if (this.publishesAfter.isBefore(other.publishesAfter)) -1 else 1
    }
}