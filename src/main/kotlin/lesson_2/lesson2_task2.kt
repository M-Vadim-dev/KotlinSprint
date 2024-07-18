package lesson_2

fun main() {
    val numberOfWorkers = 50
    val salaryWork = 30_000
    val numberOfInterns = 30
    val salaryIntern = 20_000
    val totalSalaryWork = salaryWork * numberOfWorkers
    val totalSalaryIntern = salaryIntern * numberOfInterns
    val totalSalary = totalSalaryWork + totalSalaryIntern
    val averageTotalSalary = totalSalary / (numberOfWorkers + numberOfInterns)
    println("Расход по ЗП постоянных сотрудников: $totalSalaryWork")
    println("Расход по ЗП стажеров: $totalSalaryIntern")
    println("Общие расходы по ЗП: $totalSalary")
    println("Средняя ЗП одного сотрудника: $averageTotalSalary")
}