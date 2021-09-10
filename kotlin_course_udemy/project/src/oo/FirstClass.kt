package oo

abstract class Person(open val name: String, open var age: Int) {


    init {
        println("new obj")
    }

    fun speak() {
        println("Hello!")
    }

    fun greet(name: String) {
        println("Hello $name")
    }

    fun getBirthYear(): Int {
        return 2021 - age
    }
}

class Student(override val name: String, override var age: Int): Person(name, age) {

}

fun main() {
    val person = Person("BCS", 29)
    person.speak()
    person.greet("Can")
    println(person.name)
    println(person.getBirthYear())

    val stdnt = Student("ggg", 13)
}
