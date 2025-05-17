import client.Duck
import client.MallardDuck
import client.ModelDuck
import flybehaviour.FlyRocketPowered

fun main() {
    val mallard: Duck = MallardDuck()
    mallard.performQuack()
    mallard.performFly()

    val model: Duck = ModelDuck()
    model.performFly()
    model.setNewFlyBehavior(FlyRocketPowered())
    model.performFly()
}