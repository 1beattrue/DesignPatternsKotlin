package behavioralPatterns.command

/**
 * Паттерн "Команда" (Command) позволяет инкапсулировать запрос
 * на выполнение определенного действия в виде отдельного объекта.
 * Этот объект запроса на действие и называется командой.
 * При этом объекты, инициирующие запросы на выполнение действия,
 * отделяются от объектов, которые выполняют это действие.
 */

fun main() {
    val database = Database()

    val developer = Developer(
        insert = InsertCommand(database),
        select = SelectCommand(database),
        update = UpdateCommand(database),
        delete = DeleteCommand(database)
    )

    developer.insertData()
    developer.selectData()
    developer.updateData()
    developer.deleteData()
}