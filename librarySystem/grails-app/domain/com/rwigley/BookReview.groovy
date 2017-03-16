package com.rwigley

class BookReview {

 Book book 
 Date dateMade
 Student student
 String review 

static constraints = {

 book blank:false, nullable:false
 dateMade blank:false, nullable:false
 student blank:false, nullable:false
 review blank:false, nullable:false

    }
}
