package abstractfactory

/**
 * Паттерн "Абстрактная фабрика" (Abstract Factory) предоставляет интерфейс
 * для создания семейств взаимосвязанных объектов с определенными интерфейсами
 * без указания конкретных типов данных объектов.
 */

fun main() {
    val projectTeamFactory = FactoryService.createProjectTeamFactoryByPlatform("mobile")

    val developer = projectTeamFactory.getDeveloper()
    val tester = projectTeamFactory.getTester()
    val projectManager = projectTeamFactory.getProjectManager()

    developer.writeCode()
    tester.testCode()
    projectManager.manageProject()
}