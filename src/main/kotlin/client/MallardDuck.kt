package client

import flybehaviour.FlyWithWings
import quackbehaviour.Quack

class MallardDuck : Duck() {
    init {
        quackBehavior = Quack()
        flyBehavior = FlyWithWings()
    }

    override fun display() {
        println("I’m a real Mallard duck")
    }
}