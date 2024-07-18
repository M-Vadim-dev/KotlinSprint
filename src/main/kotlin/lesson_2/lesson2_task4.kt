package lesson_2

fun main() {
    val miningCrystal = 7
    val miningIron = 11
    val buff = 0.2
    val buffActivityCrystal = true
    val buffActivityIron = true

    val miningCrystalBuff = miningCrystal + buff(miningCrystal, buff)
    val onlyMiningCrystalBuff = miningCrystalBuff - miningCrystal
    val miningIronBuff = miningIron + buff(miningIron, buff)
    val onlyMiningIronBuff = miningIronBuff - miningCrystal

    if (buffActivityCrystal) {
        println("При использовании баффа увеличивает добычу кристаллической руды на ${onlyMiningCrystalBuff.toInt()}")
    } else println("Добыто $miningCrystal кристаллической руды.")

    if (buffActivityIron) {
        println("При использовании баффа увеличивает добычу железной руды на ${onlyMiningIronBuff.toInt()}")
    } else println("Добыто $miningIron железной руды.")

}

fun buff(x: Int, y: Double): Double {
    return x * y
}
