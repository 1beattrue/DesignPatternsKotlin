package prototype

/**
 * Паттерн Прототип (Prototype) позволяет создавать объекты на основе уже ранее созданных объектов-прототипов.
 * То есть по сути данный паттерн предлагает технику клонирования объектов.
 */

fun main() {
    val master = Project(1, "SuperProject", "val sourceCode = SourceCode()")
    println("$master\n")

    val projectFactory = ProjectFactory(master)

    val masterClone = projectFactory.cloneProject()
    println(masterClone)
}
