package abstractfactory.webproject

import abstractfactory.ProjectManager

class WebProjectManager : ProjectManager {
    override fun manageProject() {
        println("Web project manager manages web project...")
    }
}