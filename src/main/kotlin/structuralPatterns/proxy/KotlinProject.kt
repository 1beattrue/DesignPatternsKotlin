package structuralPatterns.proxy

class KotlinProject(private val url: String) : Project {
    init {
        load()
    }

    private fun load() {
        println("Loading project from $url...")
    }

    override fun run() {
        println("Running project $url...")
    }
}