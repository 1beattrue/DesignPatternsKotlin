package behavioralPatterns.chainOfResponsibility

class EmailNotifier(priority: Int) : Notifier(priority) {
    override fun write(message: String) {
        println("Notifying using email: $message")
    }
}