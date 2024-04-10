package behavioralPatterns.chainOfResponsibility

abstract class Notifier(
    private val priority: Int
) {
    var nextNotifier: Notifier? = null

    fun notifyManager(message: String, level: Int) {
        if (level >= priority) {
            write(message)
        }

        nextNotifier?.notifyManager(message, level)
    }

    abstract fun write(message: String)
}