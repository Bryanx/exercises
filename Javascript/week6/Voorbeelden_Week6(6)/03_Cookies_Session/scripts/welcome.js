window.addEventListener('load', init, "false");

function init() {
    document.getElementById("user").innerHTML = getCookie("userName");
    document.getElementById("pass").innerHTML = getCookie("passWord");
}

function getCookie(naam) {
	let cookieArray = document.cookie.split(';');
	for(let i = 0; i < cookieArray.length; i++) {
		let cookie = cookieArray[i].trim();
        if (cookie.indexOf(naam) != -1) {
           return cookie.split("=")[1];
        }
	}
	return false;
}


//Get cookie routine by Shelley Powers
/*function getCookie(Name) {
  var search = Name + "="
  var returnvalue = "";
  if (document.cookie.length > 0) {
    offset = document.cookie.indexOf(search)
    // if cookie exists
    if (offset != -1) {
      offset += search.length
      // set index of beginning of value
      end = document.cookie.indexOf(";", offset);
      // set index of end of cookie value
      if (end == -1) end = document.cookie.length;
      returnvalue=unescape(document.cookie.substring(offset, end))
      }
   }
  return returnvalue;
}*/