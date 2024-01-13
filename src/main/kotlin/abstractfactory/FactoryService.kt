package abstractfactory

import abstractfactory.mobileproject.MobileTeamFactory
import abstractfactory.webproject.WebTeamFactory
import java.lang.RuntimeException

class FactoryService {
    companion object {
        fun createProjectTeamFactoryByPlatform(platform: String): ProjectTeamFactory {
            return when (platform) {
                "web" -> WebTeamFactory()
                "mobile" -> MobileTeamFactory()
                else -> throw RuntimeException("Unknown platform: $platform")
            }
        }
    }
}