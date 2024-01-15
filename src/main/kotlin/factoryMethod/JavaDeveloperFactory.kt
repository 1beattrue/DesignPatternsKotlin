package factoryMethod

class JavaDeveloperFactory : DeveloperFactory {
    override fun createDeveloper(): Developer = JavaDeveloper()
}