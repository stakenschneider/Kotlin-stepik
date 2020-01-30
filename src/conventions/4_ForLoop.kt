package conventions

class DateRange(val start: MyDate, val end: MyDate): Iterable<MyDate>{
    override fun iterator(): Iterator<MyDate> = DateIterator(this)
}

class DateIterator(private val dateRange:DateRange) : Iterator<MyDate> {
    var current: MyDate = dateRange.start
    override fun next(): MyDate {
        val result = current
        current = current.nextDay()
        return result
    }
    override fun hasNext(): Boolean = current <= dateRange.end
}

private fun MyDate.nextDay(): MyDate {
    return MyDate(1,1,1)
}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in DateRange(firstDate,secondDate)) {
        handler(date)
    }
}

fun main() {
    print(iterateOverDateRange(MyDate(2010, 1, 1),
            MyDate(2010, 2, 1)) { x: MyDate -> print("$x\n") })
}