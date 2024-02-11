package creationalPatterns.factoryMethod

import java.lang.RuntimeException

class FactoryService {
    companion object {
        fun createDeveloperFactoryBySpeciality(speciality: String): DeveloperFactory {
            return when (speciality) {
                "java" -> JavaDeveloperFactory()
                "kotlin" -> KotlinDeveloperFactory()
                else -> throw RuntimeException("Unknown speciality: $speciality")
            }
        }
    }
}