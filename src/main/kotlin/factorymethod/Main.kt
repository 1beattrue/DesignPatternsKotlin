package factorymethod

/**
 * Фабричный метод (Factory Method) - это паттерн,
 * который определяет интерфейс для создания объектов некоторого класса,
 * но непосредственное решение о том, объект какого класса создавать происходит в подклассах.
 * То есть паттерн предполагает, что базовый класс делегирует создание объектов классам-наследникам.
 */

fun main() {
    val developerFactory = FactoryService.createDeveloperFactoryBySpeciality("kotlin")
    val developer = developerFactory.createDeveloper()
    developer.writeCode()
}