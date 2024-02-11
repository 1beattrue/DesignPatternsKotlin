package structuralPatterns.adapter.example2

/**
 * Паттерн Адаптер (Adapter) предназначен для преобразования интерфейса одного класса в интерфейс другого.
 * Благодаря реализации данного паттерна мы можем использовать вместе классы с несовместимыми интерфейсами.
 */

fun main() { // client
    // путешественник
    val driver = Driver()

    // машина
    val auto = Auto()
    // отправляемся в путешествие
    driver.travel(transport = auto)

    // встретились пески, надо использовать верблюда
    val camel = Camel()
    // driver.travel(transport = camel) - не получится, так как верблюд не является транспортом

    // используем адаптер
    val camelTransport = CamelToTransportAdapter()
    // продолжаем путь по пескам пустыни
    driver.travel(transport = camelTransport)
}