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

