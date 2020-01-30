package conventions

//operator fun MyDate.rangeTo(other: MyDate) = TODO()

operator fun MyDate.rangeTo(other: MyDate): DateRange = DateRange(this, other)

private fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean =
        date in first..last

fun main() {
    print(checkInRange(MyDate(2014, 3, 22),
            MyDate(2013, 1, 1),
            MyDate(2020, 1, 1)))
}