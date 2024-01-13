package singleton

/**
 * Одиночка (Singleton, Синглтон) - порождающий паттерн,
 * который гарантирует, что для определенного класса будет создан только один объект,
 * а также предоставит к этому объекту точку доступа.
 */

fun main() {
    val db1 = Database.getInstance()
    val db2 = Database.getInstance()

    db1.addItem(1)
    db2.addItem(2)

    println("db1 items: ${db1.items}")
    println("db2 items: ${db2.items}")
}