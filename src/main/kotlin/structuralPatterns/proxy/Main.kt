package structuralPatterns.proxy

/**
 * Паттерн Заместитель (Proxy) предоставляет объект-заместитель,
 * который управляет доступом к другому объекту. То есть создается объект-суррогат,
 * который может выступать в роли другого объекта и замещать его.
 */

fun main() {
    val project = ProxyProject("https://github.com/1beattrue/project")
    project.run()
}