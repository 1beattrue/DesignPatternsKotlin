package abstractFactory.mobileProject

import abstractFactory.ProjectManager

class MobileProjectManager : ProjectManager {
    override fun manageProject() {
        println("Mobile project manager manages mobile project...")
    }
}