package com.mmm.whatsapp_kt.Modelclass

class ProfileModel {

    var image : Int = 0
    lateinit var name: String

    constructor(image: Int, name: String) {
        this.image = image
        this.name = name
    }
}