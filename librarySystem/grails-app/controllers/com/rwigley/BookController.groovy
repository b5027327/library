package com.rwigley

import grails.converters.*

class BookController {

   def scaffold=Book

def advSearch() {
	}

def advResults() {
    def bookProps = Book.metaClass.properties*.name
    def books = Book.withCriteria {
	"${params.queryType}" {
    params.each {field, value ->
	if (bookProps.grep(field) && value) {
	  ilike(field, value)
}
}
}
}

[books:books]
} 

def BIndex(Book book){

render Book.list() as JSON

if (Book == null){

flash.message="There are presently no Book details in the database."

}

}

}
