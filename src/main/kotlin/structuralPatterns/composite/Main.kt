package structuralPatterns.composite

/**
 * Паттерн Компоновщик (Composite) объединяет группы объектов в древовидную структуру
 * по принципу "часть-целое" и позволяет клиенту одинаково работать как с отдельными объектами,
 * так и с группой объектов.
 */

fun main() {
    val team = Team()

    val firstKotlinDeveloper = KotlinDeveloper()
    val secondKotlinDeveloper = KotlinDeveloper()
    val javaDeveloper = JavaDeveloper()

    team.addDeveloper(firstKotlinDeveloper)
    team.addDeveloper(secondKotlinDeveloper)
    team.addDeveloper(javaDeveloper)

    team.createProject()
}