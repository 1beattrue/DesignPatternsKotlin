package behavioralPatterns.command

class Database {
    fun insert() {
        println("Inserting data...")
    }

    fun update() {
        println("Updating data...")
    }

    fun select() {
        println("Reading data...")
    }

    fun delete() {
        println("Deleting data...")
    }
}