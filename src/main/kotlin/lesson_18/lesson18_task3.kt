package lesson_18

open class Animal(val name: String) {
    open fun eat() {
        println("$name -> ест")
    }

    open fun sleep() {
        println("$name -> спит")
    }
}

class Fox(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> ест ягоды")
    }
}

class Dog(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> грызёт кость")
    }
}

class Cat(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> ест рыбу")
    }
}

fun main() {
    val animals: List<Animal> = listOf(
        Fox("Лиса"),
        Dog("Собака"),
        Cat("Кошка")
    )

    for (animal in animals) {
        animal.eat()
    }
}