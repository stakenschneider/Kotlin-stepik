package conventions

//import TimeInterval.*

//data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

enum class TimeInterval { DAY, WEEK, YEAR }

fun MyDate.addTimeIntervals(timeInterval: TimeInterval, number: Int): MyDate {
    return MyDate(0,0,0)
}

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate = this.addTimeIntervals(timeInterval,1)

fun task1(today: MyDate): MyDate {
    return today + TimeInterval.YEAR + TimeInterval.WEEK
}

fun task2(today: MyDate): MyDate {
    return today + TimeInterval.YEAR + TimeInterval.YEAR + TimeInterval.WEEK + TimeInterval.WEEK + TimeInterval.WEEK +
            TimeInterval.DAY + TimeInterval.DAY + TimeInterval.DAY + TimeInterval.DAY + TimeInterval.DAY
}