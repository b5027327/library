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
	<h3>Book Review Management</h3>
<p>This allows for the management of book reviews within the Library Information System. You can create and display book reviews from here.</p>
	<button type="button" class="btn btn-success">
		<g:link controller="bookReview" action="create">Add Book Reviews</g:link>
	</button>
	<button type="button" class="btn btn-success">
		<g:link controller="bookReview" action="index">List Book Reviews</g:link>
	</button>
</div>

<div class="second">
	<h3>Book Management</h3>
<p>This allows for the management of books within the Library Information System. You can view a list of books in the library from here.</p>
	<button type="button" class="btn btn-success">
		<g:link controller="book" action="index">List Books</g:link>
	</button>
</div>

</div>
</div>
</body>
</html>
