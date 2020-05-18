package properties

class LazyProperty(val initializer: () -> Int) {
    private var lazyVar: Int? = null
    val lazy: Int
        get() {
            if (lazyVar == null) lazyVar = initializer.invoke()
            return lazyVar!!
        }
}