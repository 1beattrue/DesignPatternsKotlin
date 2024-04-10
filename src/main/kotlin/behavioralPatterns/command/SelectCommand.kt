package behavioralPatterns.command

class SelectCommand(
    private val database: Database
) : Command {
    override fun execute() {
        database.select()
    }
}