package lesson_15

interface Flying {
    fun fly()
}

interface Swimming {
    fun swim()
}

class Crucian : Swimming {
    override fun swim() {
        println("Карась плавает под водой.")
    }
}

class Seagull : Flying {
    override fun fly() {
        println("Чайка летит над водой.")
    }
}

class Duck : Flying, Swimming {
    override fun fly() {
        println("Утка летит над озером.")
    }

    override fun swim() {
        println("Утка плавает на воде.")
    }
}

fun main() {
    val crucian = Crucian()
    crucian.swim()

    val seagull = Seagull()
    seagull.fly()

    val duck = Duck()
    duck.fly()
    duck.swim()
}
