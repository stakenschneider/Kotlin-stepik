package conventions

class DateRangeOne(private val start: MyDate, private val endInclusive: MyDate) {
    operator fun contains(item: MyDate): Boolean = item in start..endInclusive
}

private fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in DateRangeOne(first, last)
}

fun main() {
    print(checkInRange(MyDate(2014, 3, 22),
            MyDate(2013, 1, 1),
            MyDate(2020, 1, 1)))
}
