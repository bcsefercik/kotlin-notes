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