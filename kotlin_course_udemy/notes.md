# Kotlin for Beginners (Udemy Course)

##  https://udemy.com/course/kotlin-course

## 9. Variables

```kotlin
var bcs = "bcs"
val bcs_constant = "bcs"  // cannot be changed
```

## 10. Primitive Types & Strings

```kotlin
var str1 = "bcs"
var str2 = "rocks"

str1 + str2  // string concat

val myBoolean = 13 < 26

val b: Byte = 127  // for strong typing

var f: Float = 3.73f // w/o f at the and won't work since it interpreted as double by def.
var d: Double = 3.73

d = f.toDouble()  // cannot assign directly

car c: Char = 'B'  // need to use single quote (').
```

## 11. Expressions vs. Statements

```kotlin
Expressions have return values.
3: Int
listOf(1,2,3): List

Statements don't have return values.
Assignments are  statements.
```

## 12. Nullable Variables

```kotlin
var str: String = null  // Cannot be done

var str: String?  // null by default and nullable

str?.length  // safe call, return type of is nullable int.

str!!.length  // Assures nullable value will not be null
```

## 15.Conditionals

```kotlin
if (cond1) {
    ...
} else if (cond2) {
    ...
} else {
    ...
}


val mode: Int = 2
when (mode) {
    1 -> println("One")
    2 -> {
        println("One")
    }
    else -> {
        println("gg")
    }
}


when and if can be used as expressions.
var result = when (mode) {
    1 -> 5
    2 -> {
        "Two"
        13
    else -> 26
    }
}  // last line is result

// need to use else if we assign result to variable.
```

## 18. Advanced `when`

```kotlin
when (x) {
    in 1..10 -> print("x is in the range")
    in validNumbers -> print("x is valid")
    !in 10..20 -> print("x is outside the range")
    else -> print("none of the above")
}
```

- If multiple cases are `true` it selects the upper one.

## 20. Arrays and Lists

- Use arrays if you know the number of elements.

```kotlin
val arr = arrayOf("B", "C", "S")
val mixed = arrayOf("BCS", 13, 13.0, true)
val nums = intArrayOf(1, 2, 3, 4)

val lst = listOf("B", "C", "S")  //IMmutable

val alst = arrayListOf("B", "C", "S")  // Mutable
alst.add("rox")
alst.add(1, "YO!")  // Adds to index 1.
alst.remove("YO!")  // returns bool of if list changed.
alst.subList(1, 3) // until 3rd index, not included.

arr_con = arr1 + arr2  // Array concat
```

## 23. Loops
```kotlin
for (i in 1..10) {
    println(i)  // 10 included
}

for ((i, val) in lst.withIndex()) {
    println("$i $val")
}


while (cond1) {
    i++
}


// Naming loops
outer@ for (i in 1..10) {
    for (j in 1..10) {
        if (i - j == 5) {
            break@outer  // can be continue@outer
        }
    }
} 
```

## 32. OOP
```kotlin
// Constructor
class Person(name: String) {
    val name: String
    init {
        this.name = name
    }
}

//Named params
class House(val height: Double, val color: String = "White") {
    ...
}
val h = House(height=13.13, "black")
val h2 = House(color="black", height=13.13)
val h3 = House(height=13.13)
```

## 38. Open CLasses and Inheritance
```kotlin
open class Person(open val name: String, open var age: Int) { ... }  // open means this class is interitable. open preceding params means they overridable.

class Student(override val name: String, override var age: Int): Person(name, age) { ... }
```

## 39. Abstract Classes
```kotlin
abstract class Person(open val name: String, open var age: Int) { 
    abstract fun speak()  // Has to be defined
    open fun gg() { ... }  // Can be overriden but not required.
}

// Can't init objects from abstract classes.
// To define speak in inheriting classes:
class Student(override val name: String, override var age: Int): Person(name, age) {
    override fun speak() { ... }
}
```

## 41. Interfaces
- Every method defined in interfaces is abstract.
- A class can implement more than one interface.
```kotlin
interface Drivable {
    val time: Int
    fun drive()
}

interface Buildable {
    fun build()
}

class Car(val color: String): Drivable, Buildable {
    override val time = 13
    override fun drive() { ... }
    override fun build() { ... }
}
```

## 42. OOP Part II
```kotlin
abstract class Parent(...) {
    open fun foo() { ... }
}

open class Child(...): Parent(...) {
    override final fun learn() {}  // GrandChild cannot override this method due final keyword.
}

class GrandChild: Child(...) { ... }


interface Learnable {
    fun foo() { ... }
}

class Course(): Parent(...), Learnable {
    override final fun foo() {
        super<Learnable>.foo()
        ...
    }
}
```

## 43. Data Classes
```kotlin
class Book(val title: String, var author: String) {...}

data class DataBook(val title: String, var author: String) {...}

dataBook = DataBook("Hey", "BCS")

val (title, author) = dataBook
```
- print works differently for `data` classes.
- `data` class has `<1>.equals(<2>)`
- `<dataObj>.copy(title = "yo!")`
- `hashSetOf(db1, db2, db1copy)` generate two sized hash set.


## 44. Singletons
```kotlin
object Cache {  // oebject decleration.
    val name = "too"
    
    fun foo() {...}
}
```

## 46. Enums

```kotlin
enum class Color {
    RED, GREEN, BLUE
}
```
 
## 47. Packages
```kotlin
import java.util.*  // or import java.util.Data
Date()
// or
java.util.Date()

import anotherpackage.Functions

import packagename.ClassName
import packagename.ClassName.methodName
import packagename.ClassName.propertyName
```
- Nested packages are possible.
- Some packages are imported by default.

## 49. Binary & Hexadecimal Numbers
```kotlin
println(0x10)  // prints 16. Hexadecimal
println(0b1000)  // print 16. Binary

0b11111111 == 0xFF  // true
0b11111111_00000000_00000000 == 0xFF0000  // true

0b10 and 0b01 // 0, bitwise and

enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF)
    
    fun containsRed(): Boolean {
        return this.rgb and 0xFF0000 != 0
    }
}

// bitwise operators
and
or
xor
<binarynum>.inv()  // binary inverse of the number

0b10011.inv() and 0x0000001F  // 0b01100
```

## 52. OOP Part III

- getters and setters are defined automatically.
- `<obj>.<property>` calls getter of the property.
- `<obj>.<property> = 1` calls setter of the property.
- `val` properties have only getters.
- `field` is a special keyword.

```kotlin
class Animal {
    var age: Int = 0
        get() = field  // by default
        set(value) {
            if (value > 0) {
                field = value
            }
        }
}
```

## 54. VIsibilities

```kotlin
class Animal {
    private var age: Int = 0  // highest level of information hiding.
    protected var name: String = "sam"  // can be reached from subclasses.
    internal val isGG = true  // Can be accessed inside the module. Includes other packages.
    
    public fun isOld() {...}  // Default visibility
}
```

## 55. Generics

- `vararg` allows you to add as many elements as you want belonging to spesific type.

```kotlin
class Stack<E>(vararg val items: E) {  // E, T, K or V generally
    
    val elements = items.toMutableList()
    
    fun push(element: E) {
        elements.add(element)
    }
    
    fun pop(): E {
        return elements.removeAt(elements.size - 1)
    }
}

// Generic function
fun <T> stackOf(vararg elements: T): Stack<T> {
    return Stack(*elements)  // * converts array to vararg
}

```

## 58. I/O













