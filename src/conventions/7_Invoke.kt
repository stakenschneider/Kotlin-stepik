package conventions

class Pp {
    var numberOfInvocations: Int = 0
        private set

    operator fun invoke(): Pp {
        numberOfInvocations++
        return this
    }
}

fun invokeTwice(invokable: Pp) = invokable()()

fun main() {
    print(invokeTwice(Pp()).numberOfInvocations)
    Pp()()()()()()
}