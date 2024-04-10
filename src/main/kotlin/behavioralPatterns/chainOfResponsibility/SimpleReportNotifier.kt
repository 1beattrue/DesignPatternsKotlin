package behavioralPatterns.chainOfResponsibility

class SimpleReportNotifier(priority: Int) : Notifier(priority) {
    override fun write(message: String) {
        println("Notifying using simple report: $message")
    }
}