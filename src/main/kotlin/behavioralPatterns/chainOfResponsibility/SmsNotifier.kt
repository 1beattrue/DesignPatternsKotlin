package behavioralPatterns.chainOfResponsibility

class SmsNotifier(priority: Int) : Notifier(priority) {
    override fun write(message: String) {
        println("Notifying using SMS: $message")
    }
}