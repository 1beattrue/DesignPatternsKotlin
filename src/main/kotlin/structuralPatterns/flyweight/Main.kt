package structuralPatterns.flyweight

/**
 * Паттерн Приспособленец (Flyweight) - структурный шаблон проектирования,
 * который позволяет использовать разделяемые объекты сразу в нескольких контекстах.
 * Данный паттерн используется преимущественно для оптимизации работы с памятью.
 */

fun main() {
    val developerFactory = DeveloperFactory()

    val developers = mutableListOf<Developer>()

    repeat(5) {
        developers.add(developerFactory.getDeveloperBySpeciality("java"))
    }
    repeat(5) {
        developers.add(developerFactory.getDeveloperBySpeciality("kotlin"))
    }

    developers.forEach { developer ->
        developer.writeCode()
    }
}