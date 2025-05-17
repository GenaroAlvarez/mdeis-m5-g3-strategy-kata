package client

import quackbehaviour.Quack
import quackbehaviour.QuackBehavior

class DuckCall {
    var quackBehavior: QuackBehavior = Quack()

    fun performQuack() {
        quackBehavior.quack()
    }
}