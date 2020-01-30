package conventions

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate) = compareValuesBy(this, other, { it.year }, { it.month }, { it.dayOfMonth })
}

fun compare(date1: MyDate, date2: MyDate) = date1 < date2