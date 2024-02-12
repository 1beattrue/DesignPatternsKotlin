package structuralPatterns.facade

/**
 * Фасад (Facade) представляет шаблон проектирования,
 * который позволяет скрыть сложность системы с помощью предоставления упрощенного интерфейса для взаимодействия с ней.
 */

fun main() {
    val textEditor = TextEditor()
    val compiler = Compiler()
    val jvm = Jvm()

    val ide = IntelliJIdeaFacade(textEditor, compiler, jvm)

    val programmer = Programmer()
    programmer.createApplication(ide)
}