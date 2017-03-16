package com.rwigley

class Student {

 String name 
 String email
 String username
 String password
 String studentID
 Course course
 Library library

static hasMany=[books:Book]

static constraints = {

 name blank:false, nullable:false
 email blank:false, nullable:false, email:true
 username blank:false, nullable:false, unique:true
 password blank:false, nullable:false, password:true
 studentID blank:false, nullable:false
 course blank:false, nullable:false
 library blank:false, nullable:false

    }
}
