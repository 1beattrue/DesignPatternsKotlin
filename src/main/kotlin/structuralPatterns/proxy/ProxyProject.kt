package structuralPatterns.proxy

class ProxyProject( // proxy
    private val url: String
) : Project {
    private var kotlinProject: KotlinProject? = null

    override fun run() {
        if (kotlinProject == null) {
            kotlinProject = KotlinProject(url)
        }
        kotlinProject?.run()
    }
}