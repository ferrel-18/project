package com.example.schoolproject

class DataClass {
    var fullname:String?=null
    var address:String?=null
    var phonenumber:String?=null
    var emailaddress:String?=null
    var bookname:String?=null

    constructor(fullname:String?,address:String?,phonenumber:String?,emailaddress:String?,bookname:String?){
        this.fullname=fullname
        this.address=address
        this.phonenumber=phonenumber
        this.emailaddress=emailaddress
        this.bookname=bookname
    }

}