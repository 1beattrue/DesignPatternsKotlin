package structuralPatterns.decorator

/**
 * Декоратор (Decorator) представляет структурный шаблон проектирования,
 * который позволяет динамически подключать к объекту дополнительную функциональность.
 */

fun main() {
    val developer: Developer = KotlinTeamLead(SeniorKotlinDeveloper(KotlinDeveloper()))

    println(developer.makeJob())
}