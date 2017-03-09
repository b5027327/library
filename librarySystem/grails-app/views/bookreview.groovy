package com.rwigley

class Course {

 String book 
 Date dateCreated
 String student
 String review

static constraints = {

 book blank:false, nullable:false
 dateCreated blank:false, nullable:false, email:true
 student blank:false, nullable:false
 review blank:false, nullable:false, password:true

    }
}
