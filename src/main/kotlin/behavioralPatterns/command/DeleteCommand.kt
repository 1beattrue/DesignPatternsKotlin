package behavioralPatterns.command

class DeleteCommand(
    private val database: Database
) : Command {
    override fun execute() {
        database.delete()
    }
}