package creationalPatterns.abstractFactory.webProject

import creationalPatterns.abstractFactory.ProjectManager

class WebProjectManager : ProjectManager {
    override fun manageProject() {
        println("Web project manager manages web project...")
    }
}