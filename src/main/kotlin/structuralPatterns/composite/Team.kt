package structuralPatterns.composite

class Team { // composite
    private val developers: MutableList<Developer> = mutableListOf()

    fun addDeveloper(developer: Developer) {
        developers.add(developer)
    }

    fun removeDeveloper(developer: Developer) {
        developers.remove(developer)
    }

    fun createProject() {
        println("Team creates project...\n")
        developers.forEach { developer ->
            developer.writeCode()
        }
    }
}
