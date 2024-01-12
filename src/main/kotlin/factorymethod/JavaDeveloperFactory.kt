package factorymethod

class JavaDeveloperFactory : DeveloperFactory {
    override fun createDeveloper(): Developer = JavaDeveloper()
}