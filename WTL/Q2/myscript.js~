function validate1(){
	var name = document.getElementsByName("name")[0].value;
	var mobile = document.getElementsByName("mobile")[0].value;
	
	if(!(/^[A-Z][a-zA-Z ]*$/.test(name))){
		alert("ENTER CORRECT NAME");
		return false;
	}
	if(!(/^[1-9][0-9]{9}$/.test(mobile))){
		alert("INVALID MOBILE NUMBER");
		return false;
	}
}
function validate2(){
	var name = document.getElementsByName("name")[0].value;
	var card = document.getElementsByName("card")[0].value;
	var expiry = document.getElementsByName("exp")[0].value;
	var cvv = document.getElementsByName("cvv")[0].value;

	if(!(/^[A-Z][a-zA-Z ]*$/.test(name))){
		alert("ENTER CORRECT NAME");
		return false;
	}
	if(!(/^[0-9]{16}$/.test(card))){
		alert("ENTER CORRECT CARD NUMBER");
		return false;
	}
	if(!(/^\d{4}\/\d{1,2}$/.test(expiry))){
		alert("EXPIRY DATE MUST BE YYYY/MM FORMAT");
		return false;
	}
	if(!(/^[0-9]{3}$/.test(cvv))){
		alert("ENTER VALID CVV");
		return false;
	}
	var sections = expiry.split('/');
	
 	var year= parseInt(sections[0], 10);
        var month= parseInt(sections[1], 10);
        var currentMonth = new Date().getMonth();
        var currentYear  = new Date().getFullYear();

        if (month <= 0 || month > 12 || year > currentYear + 10) {
            alert('The expiration date is not valid');
            return false;                      
        }

        if (year < currentYear || (year == currentYear && month < currentMonth)) {
        	alert('The card is expired');
        	return false;
         }		 
}
