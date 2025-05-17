package quackbehaviour

class MuteQuack : QuackBehavior {
    override fun quack() {
        println("<< Silence >>")
    }
}