package behavioralPatterns.interpreter

/**
 * Паттерн Интерпретатор (Interpreter) определяет представление грамматики
 * для заданного языка и интерпретатор предложений этого языка.
 * Как правило, данный шаблон проектирования применяется для часто повторяющихся операций.
 */

fun main() {
    val isBackendDeveloper = getBackendExpression()
    val isAndroidDeveloper = getAndroidExpression()

    println("Does developer knows Backend: ${isBackendDeveloper.interpret("Kotlin")}")
    println("Does developer knows Android: ${isAndroidDeveloper.interpret("Kotlin, Android Sdk")}")
}

fun getBackendExpression(): Expression {
    val kotlin = TerminalExpression("Kotlin")
    val java = TerminalExpression("Java")
    return OrExpression(kotlin, java)
}

fun getAndroidExpression(): Expression {
    val kotlin = TerminalExpression("Kotlin")
    val androidSdk = TerminalExpression("Android Sdk")
    return AndExpression(kotlin, androidSdk)
}