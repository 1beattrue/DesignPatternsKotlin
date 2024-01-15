package abstractFactory.mobileProject

import abstractFactory.Developer

class MobileDeveloper : Developer {
    override fun writeCode() {
        println("Mobile developer writes mobile code...")
    }
}