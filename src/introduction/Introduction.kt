package introduction

import java.util.*

// 1.1 Hello, world!
fun start(): String = "OK"

// 1.2 Java to Kotlin conversion
class JavaCode {
    fun toJSON(collection: Collection<Int?>): String {
        val sb = StringBuilder()
        sb.append("[")
        val iterator = collection.iterator()
        while (iterator.hasNext()) {
            val element = iterator.next()
            sb.append(element)
            if (iterator.hasNext()) {
                sb.append(", ")
            }
        }
        sb.append("]")
        return sb.toString()
    }
}

// 1.3 Named arguments
fun joinOptions(options: Collection<String>) = options.joinToString(
        separator = ", ",
        postfix = "]",
        prefix = "["
)

// 1.4 Default arguments
fun foo(name: String, number: Int = 42, toUpperCase: Boolean = false) =
        (if (toUpperCase) name.toUpperCase() else name) + number

fun useFoo() = listOf(
        foo("a"),
        foo("b", number = 1),
        foo("c", toUpperCase = true),
        foo(name = "d", number = 2, toUpperCase = true)
)

// 1.5 Lambdas
fun containsEven(collection: Collection<Int>): Boolean = collection.any { it.rem(2) == 0 }

// 1.6 Strings
const val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"

fun getPattern(): String = """([0-9]{2}) {""" + month.trimEnd(')').trimStart('(') + """} ([0-9]{4})"""

// 1.7 Data classes
data class Person(val name: String, val age: Int)

fun getPeople(): List<Person> {
    return listOf(Person("Alice", 29), Person("Bob", 31))
}

// 1.8 Nullable types
fun sendMessageToClient(client: Client?, message: String?, mailer: Mailer
) {
    if (client == null || message == null) return
    val personalInfo: PersonalInfo = client.personalInfo ?: return
    val email: String = personalInfo.email ?: return
    mailer.sendMessage(email, message)
}

class Client(val personalInfo: PersonalInfo?)
class PersonalInfo(val email: String?)
interface Mailer {
    fun sendMessage(email: String, message: String)
}

// 1.9 Smart casts
fun eval(expr: Expr): Int =
        when (expr) {
            is Num -> expr.value
            is Sum -> eval(expr.left) + eval(expr.right)
            else -> throw IllegalArgumentException("Unknown expression")
        }

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

// 1.10 Extension functions
fun Int.r(): RationalNumber = RationalNumber(this, 1)

fun Pair<Int, Int>.r(): RationalNumber = RationalNumber(this.first, this.second)

data class RationalNumber(val numerator: Int, val denominator: Int)

// 1.11 Object expressions
fun getListOE(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    arrayList.sortWith(Comparator { x, y -> y - x })
    return arrayList
}

// 1.12 SAM conversions
fun getListSAM(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    arrayList.sortWith(Comparator { x, y -> y - x })
    return arrayList
}

// 1.13 Extension functions on collections
fun getList(): List<Int> {
    return arrayListOf(1, 5, 2).sortedDescending()
}
