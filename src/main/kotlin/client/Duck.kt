package client

import flybehaviour.FlyBehavior
import quackbehaviour.QuackBehavior

abstract class Duck {
    protected var flyBehavior: FlyBehavior? = null
    protected var quackBehavior: QuackBehavior? = null

    abstract fun display()

    fun performFly() {
        flyBehavior!!.fly()
    }

    fun performQuack() {
        quackBehavior!!.quack()
    }

    fun swim() {
        println("All ducks float, even decoys!")
    }

    fun setNewFlyBehavior(fb: FlyBehavior) {
        flyBehavior = fb
    }

    fun setNewQuackBehavior(qb: QuackBehavior) {
        quackBehavior = qb
    }
}