package abstractfactory.mobileproject

import abstractfactory.Developer

class MobileDeveloper : Developer {
    override fun writeCode() {
        println("Mobile developer writes mobile code...")
    }
}