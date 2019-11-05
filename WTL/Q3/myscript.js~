function addEntry(){
	var table = document.getElementById("result").innerHTML;
	var name = document.getElementsByName("name")[0].value;
	var english = parseInt(document.getElementsByName("english")[0].value);
	var marathi = parseInt(document.getElementsByName("marathi")[0].value);
	var maths = parseInt(document.getElementsByName("maths")[0].value);
	var science = parseInt(document.getElementsByName("science")[0].value);
	var history = parseInt(document.getElementsByName("history")[0].value);

	var percentage = ((english + marathi + maths + science + history )/500)*100;

	var entry = "<tr><td>"+name+"</td><td>"+english+"</td><td>"+marathi+"</td><td>"+maths+"</td><td>"+science+"</td><td>"+history+"</td><td>"+percentage.toFixed(2)+" %</td></tr>";

	table = table + entry;
	
	document.getElementById("result").innerHTML = table;

	return false;
}
