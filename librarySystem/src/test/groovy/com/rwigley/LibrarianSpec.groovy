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
