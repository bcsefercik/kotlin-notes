package loops

fun main() {
    for (i in 1..10) {
        println(i)
    }

    outer@ for (i in 1..10) {
        for (j in 1..10) {
            if (i - j == 5) {
                break@outer  // can be continue@outer
            }
            println("$i, $j")
        }
    }
}
