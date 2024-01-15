package abstractFactory.webProject

import abstractFactory.ProjectManager

class WebProjectManager : ProjectManager {
    override fun manageProject() {
        println("Web project manager manages web project...")
    }
}