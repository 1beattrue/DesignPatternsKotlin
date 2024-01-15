package prototype

class Project(
    private val projectId: Int,
    private val projectName: String,
    private val projectCode: String
) : Copyable {
    override fun copy(): Any {
        return Project(projectId, projectName, projectCode)
    }

    override fun toString(): String {
        return "Project(projectId=$projectId, projectName='$projectName', projectCode='$projectCode')"
    }
}