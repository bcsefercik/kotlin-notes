package oo

class House(val height: Double, val color: String = "White") {
    fun print() {
        println("$height, $color")
    }
}

fun main() {
    val h = House(height=13.13)
    h.print()
}
