var path 	= require('path');
var express = require('express');
var app 	= express();

app.use("/", express.static(path.join(__dirname, '/')));
app.get('/', function(req, res) {
	res.sendFile(__dirname + '/tree.html');
});

app.listen(8000, function() {
	console.log('App listening at ' + 8000)
});