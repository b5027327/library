package com.rwigley

class BootStrap {

    def init = { servletContext ->

def library1 = new Library (

building: 'Terry Chocolate Library', 
address: '23 Arundel Gate, Sheffield',
openingHours: '09:00 - 17:00',
location: 'Terry Building',
studySpaces: '42'

).save()

def library2 = new Library (

building: 'Sheffield Library', 
address: '42 Glossop Road, Sheffield',
openingHours: '09:00 - 17:00',
location: 'Glossop Building',
studySpaces: '24'

).save()

def lib1 = new Librarian (

name: 'Mary Berry', 
email: 'm.berry@my.shu.ac.uk',
office: 'Office 101',
username: 'mberry',
password: 'password',
telephone: '01142459846',
library: library1

).save()

def lib2 = new Librarian (

name: 'Paul Hollywood', 
email: 'p.hollywood@my.shu.ac.uk',
office: 'Office 010',
username: 'phollywood',
password: 'password',
telephone: '01142454597',
library: library2

).save()

def cour1 = new Course (

title: 'Computing',
code: 'COMP',
leader: 'Tonderai Maswera',
department: 'ACES',
description: 'Computing Course',
studyMode: 'Full Time'

).save()

def cour2 = new Course (

title: 'Film Studies',
code: 'FILMS',
leader: 'Ben Wheatley',
department: 'FMSS',
description: 'Film Studies Course',
studyMode: 'Part Time'

).save()


def stu1 = new Student (

name: 'Barry Chuckle',
email: 'b.chuckle@my.shu.ac.uk',
username: 'bchuckle',
password: 'password',
studentID: 'b5012345',
course: cour1,
library: library1

).save()

def stu2 = new Student (

name: 'River Song',
email: 'r.song@my.shu.ac.uk',
username: 'rsong',
password: 'password',
studentID: 'b5067890',
course: cour2,
library: library2

).save()

def stu3 = new Student (

name: 'Steven Morrissey',
email: 's.morrissey@my.shu.ac.uk',
username: 'smorrissey',
password: 'password',
studentID: 'b5012789',
course: cour2,
library: library1

).save()

def book1 = new Book (

title: 'Computing for Dummies', 
subject: 'Computing',
author: 'Nancy Muir',
isbn: '97811190495555',
dateBorrowed: new Date('10/03/2017'),
returnDate: new Date('17/03/2017'),
student: stu3,
overdue: false,
library: library1

).save()

def book2 = new Book (

title: 'Nineteen Eighty-Four', 
subject: 'Dystopian',
author: 'George Orwell',
isbn: '9780141036144',
dateBorrowed: new Date('21/03/2017'),
returnDate: new Date('28/03/2017'),
student: stu1,
overdue: false,
library: library2

).save()

def review1 = new BookReview (

book: book2,
dateMade: new Date('16/03/2017'),
student: stu3,
review: 'This book was very good.'

).save()

def review2 = new BookReview (

book: book1,
dateMade: new Date('16/03/2017'),
student: stu2,
review: 'I did not think this book was very helpful.'

).save()

}
    def destroy = {
    }
}
