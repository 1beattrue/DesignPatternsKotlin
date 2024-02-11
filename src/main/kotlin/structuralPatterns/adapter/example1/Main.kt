package structuralPatterns.adapter.example1

/**
Паттерн Адаптер (Adapter) предназначен для преобразования интерфейса одного класса в интерфейс другого.
Благодаря реализации данного паттерна мы можем использовать вместе классы с несовместимыми интерфейсами.
*/

fun main() { // client
    val database = ApplicationToDatabaseAdapter()

    database.insert()
    database.update()
    database.select()
    database.remove()
}