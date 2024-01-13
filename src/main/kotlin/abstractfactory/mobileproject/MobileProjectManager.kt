package abstractfactory.mobileproject

import abstractfactory.ProjectManager

class MobileProjectManager : ProjectManager {
    override fun manageProject() {
        println("Mobile project manager manages mobile project...")
    }
}