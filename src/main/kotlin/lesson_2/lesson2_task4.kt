package lesson_2

const val HUNDRED_PERCENT = 100

fun main() {
    val miningCrystal = 7
    val miningIron = 11
    val buff = 20

    val miningCrystalBuff = (miningCrystal * buff / HUNDRED_PERCENT)
    val miningIronBuff = (miningIron * buff / HUNDRED_PERCENT)

    println("Кристаллы: $miningCrystalBuff ")
    println("Железная руда: $miningIronBuff")
}
