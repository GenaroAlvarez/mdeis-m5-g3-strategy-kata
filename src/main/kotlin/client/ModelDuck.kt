package client

import flybehaviour.FlyNoWay
import quackbehaviour.Quack

class ModelDuck : Duck() {
    init {
        flyBehavior = FlyNoWay()
        quackBehavior = Quack()
    }

    override fun display() {
        println("I’m a model duck")
    }
}