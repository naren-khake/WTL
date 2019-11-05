<html>
<head>
<title>STUDENT DETAILS</title>
</head>
<body>
<center>
<h3>STUDENT'S DETAILS</h3>
<table style="text-align:center;width:50%" border>
<tr>
	<th>ROLL NO</th>
	<th>NAME</th>
	<th>DEPARTMENT</th>
	<th>PERCENTAGE</th>
</tr>
<?php
	$connection = mysqli_connect("localhost","root","","test");
	
	if(!$connection){
		die("COULD NOT CONNECT TO DATABASE");
	}


	$sql = mysqli_query($connection,"SELECT * FROM Q13 ORDER BY perc DESC");

	if($sql){
		while($row = mysqli_fetch_assoc($sql)){		
?>
<tr>
	<td><?php echo $row['roll'];?></td>
	<td><?php echo $row['name'];?></td>
	<td><?php echo $row['dept'];?></td>
	<td><?php echo $row['perc'];?></td>
</tr>
<?php 
		}
	}
	else{
		die("COULD FETCH DATA FROM DATABASE");
	}
	mysqli_close($connection);
?>
</table>
</center>
</body>
</html>
