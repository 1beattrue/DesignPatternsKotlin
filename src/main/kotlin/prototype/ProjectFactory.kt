package prototype

class ProjectFactory(
    private val project: Project
) {
    fun cloneProject(): Project = project.copy() as Project
}