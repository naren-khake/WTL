function xmlParser(){
	var name = document.getElementsByName("name")[0].value;	
	var address = document.getElementsByName("address")[0].value;
	var city = document.getElementsByName("city")[0].value;
	var ele = document.getElementsByName("gender");
	var gender;
	for(var i=0;i<ele.length;i++){
		if(ele[i].checked){
			gender=ele[i].value;
		}
	}

	var array = document.getElementsByClassName("language");

	var xmlText = "<?xml version='1.0' encoding='UTF-8'?>\n";
	xmlText = xmlText + "<Customer>\n<Name>"+name+"</Name>\n<Address>"+address+"</Address>\n<City>"+city+"</City>\n<Gender>"+gender+"</Gender>\n<Languages>";

	for(var i=0;i<array.length;i++){
		if(array[i].checked){
			xmlText = xmlText + "\t<lang>" + array[i].value + "</lang>\n";
		}
	}
	xmlText = xmlText + "</Languages>\n</Customer>";

	download("CustomerDetail.xml",xmlText);
}
function download(filename,data){
	var tag = document.createElement("a");
	tag.setAttribute("href","data:text/xml,"+data);
	tag.setAttribute("download",filename);
	document.body.appendChild(tag);
	tag.click();
	document.body.removeChild(tag);
}
