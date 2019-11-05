<?php

	$connection=mysqli_connect("localhost","root","","test");

	if(!$connection){
		die('COULD NOT CONNECT: '. mysqli_error($connection));
	}

	echo "CONNECTED SUCCESSFULLY <br>";

	$rollno = $_POST['rollno'];
	$name = $_POST['name'];
	$department = $_POST['department'];

	$sql = mysqli_query($connection, "INSERT INTO Q12 VALUES('$rollno','$name','$department')");

	if($sql){
		echo 'INSERT DATA SUCCESSFULLY';
	}
	else{
		die('COULD NOT INSERT DATA IN DATABASE');
	}
	mysqli_close($connection);
?>
