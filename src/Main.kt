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
fun containsEven(collection: Collection<Int>): Boolean = collection.any {
    for (it in collection)
        if (it.rem(2) == 0)
            return true
    return false
}

// 1.6 Strings
const val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"

fun getPattern(): String = """([0-9]{2}) {""" + month.trimEnd(')').trimStart('(')+"""} ([0-9]{4})"""

// 1.7 Data classes
data class Person(val name: String, val age: Int)

fun getPeople(): List<Person> {
    return listOf(Person("Alice", 29), Person("Bob", 31))
}
