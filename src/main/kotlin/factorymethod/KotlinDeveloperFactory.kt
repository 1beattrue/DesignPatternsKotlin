package factorymethod

class KotlinDeveloperFactory : DeveloperFactory {
    override fun createDeveloper(): Developer = KotlinDeveloper()
}