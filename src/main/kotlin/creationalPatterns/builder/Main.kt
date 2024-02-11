package creationalPatterns.builder

/**
 * Строитель (Builder) - шаблон проектирования,
 * который инкапсулирует создание объекта и позволяет разделить его на различные этапы.
 */

fun main() {
    val student = Student.Builder()
        .name("Ivan")
        .age(20)
        .speciality("programming")
        .build()

    println(student)
}