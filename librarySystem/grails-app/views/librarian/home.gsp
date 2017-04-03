<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to the Library Information System</title>
    <asset:stylesheet src="home.css" />
    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
</head>
<body>

    <div id="content" role="main">
    <div class="row">

<div class="first">
	<h3>Student Management</h3>
<p>This allows for the management of students within the Library Information System. You can register students from here.</p>
	<button type="button" class="btn btn-success">
		<g:link controller="student" action="create">Add Students</g:link>
	</button>
</div>

<div class="second">
	<h3>Book Management</h3>
<p>This allows for the management of books within the Library Information System. You can add books to the library from here.</p>
	<button type="button" class="btn btn-success">
		<g:link controller="book" action="create">Add Books</g:link>
	</button>
</div>

<div class="first">
	<h3>Course Management</h3>
<p>This allows for the management of courses within the Library Information System. You can enter course details and create a course from here.</p>
	<button type="button" class="btn btn-success">
		<g:link controller="course" action="create">Add Courses</g:link>
	</button>
</div>

<div class="second">
	<h3>Librarian Management</h3>
<p>This allows for the management of librarians within the Library Information System. You can register librarians from here.</p>
	<button type="button" class="btn btn-success">
		<g:link controller="librarian" action="create">Librarians</g:link>
	</button>
</div>

</div>
</div>
</body>
</html>
