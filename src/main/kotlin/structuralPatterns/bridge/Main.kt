package structuralPatterns.bridge

/**
 * Мост (Bridge) - структурный шаблон проектирования,
 * который позволяет отделить абстракцию от реализации таким образом,
 * чтобы и абстракцию, и реализацию можно было изменять независимо друг от друга.
 */

fun main() {
    val programs = arrayOf(
        BankSystem(JavaDeveloper()),
        StockExchange(KotlinDeveloper())
    )

    programs.forEach { program ->
        program.developProgram()
    }
}