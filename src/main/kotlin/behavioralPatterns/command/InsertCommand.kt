package behavioralPatterns.command

class InsertCommand(
    private val database: Database
) : Command {
    override fun execute() {
        database.insert()
    }
}