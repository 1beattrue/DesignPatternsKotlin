package behavioralPatterns.command

class Developer(
    private val insert: Command,
    private val select: Command,
    private val update: Command,
    private val delete: Command,
) {
    fun insertData() {
        insert.execute()
    }

    fun selectData() {
        select.execute()
    }

    fun updateData() {
        update.execute()
    }

    fun deleteData() {
        delete.execute()
    }
}