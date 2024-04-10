package behavioralPatterns.command

class UpdateCommand(
    private val database: Database
) : Command {
    override fun execute() {
        database.update()
    }
}