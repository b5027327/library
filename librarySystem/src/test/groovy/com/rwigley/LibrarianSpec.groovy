package com.rwigley

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Librarian)
class LibrarianSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

	void EmailValid() {

	when: "Email field is typed incorrectly and doesn't match email:true constraint"

	def librarian1 = new Librarian (

	name: 'Mary Berry', 
	email: 'm.berry.hotmail.co.uk',
	office: 'Office 101',
	username: 'mberry',
	password: 'password',
	telephone: '01142459846'

)	
        then:"email:true constraint will trigger on the Email attribute"
        
	!librarian1.validate() 

    }

void toString() {

	when: "A Librarian has a name, email and office"

	def Peter = new Librarian(

	name: 'Peter Smith',
	email: 'psmith@my.shu.ac.uk',
	office: 'Office-111'

	)

	then: "the toString method will merge them into one output"

	Peter.toString() == 'Peter Smith, psmith@my.shu.ac.uk, Office-111'

}

}
