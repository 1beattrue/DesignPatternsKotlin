package behavioralPatterns.chainOfResponsibility

/**
 * Цепочка Обязанностей (Chain of responsibility) - поведенческий шаблон проектирования,
 * который позволяет избежать жесткой привязки отправителя запроса к получателю.
 * Все возможные обработчики запроса образуют цепочку, а сам запрос перемещается по этой цепочке.
 * Каждый объект в этой цепочке при получении запроса выбирает, либо закончить обработку запроса,
 * либо передать запрос на обработку следующему по цепочке объекту.
 */

fun main() {
    val reportNotifier = SimpleReportNotifier(Priority.ROUTINE)
    val emailNotifier = EmailNotifier(Priority.IMPORTANT)
    val smsNotifier = SmsNotifier(Priority.ASAP)

    reportNotifier.nextNotifier = emailNotifier
    emailNotifier.nextNotifier = smsNotifier

    reportNotifier.notifyManager("Everything is OK", Priority.ROUTINE)
    println()

    reportNotifier.notifyManager("Something went wrong!", Priority.IMPORTANT)
    println()

    reportNotifier.notifyManager("Houston, we have a problem!!", Priority.ASAP)
}