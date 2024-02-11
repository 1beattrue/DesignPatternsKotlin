package creationalPatterns.abstractFactory.mobileProject

import creationalPatterns.abstractFactory.ProjectManager

class MobileProjectManager : ProjectManager {
    override fun manageProject() {
        println("Mobile project manager manages mobile project...")
    }
}