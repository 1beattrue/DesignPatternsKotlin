package abstractFactory.webProject

import abstractFactory.Developer

class WebDeveloper : Developer {
    override fun writeCode() {
        println("Web developer writes web code...")
    }
}