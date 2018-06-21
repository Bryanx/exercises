window.addEventListener('load', init, false);

function init() {
    let first = document.getElementById("first");
    let back = document.getElementById("back");

    if (!getCookie("userName")) {
        first.style.display = "block";
        document.getElementById("klik").addEventListener('click', cookieHandler, false);
    } else {
        let terug = document.getElementById("terug");
        terug.innerHTML = getCookie("userName");
        first.style.display = "none";
        back.style.display = "block";
    }
}

function cookieHandler() {
    let deNaam = document.getElementById("naam").value;
    setCookie("userName", deNaam, 60);  // 1 minuut!
    document.getElementById("create").innerHTML = "Je bent opgeslagen in een cookie " + deNaam + "!";
}

function getCookie(cookieNaam) {
    if (document.cookie.indexOf(cookieNaam) != -1) {
       return document.cookie.split("=")[1];
    }
    return false;
}

function setCookie(cookieNaam, waarde, seconden) {
    let expire = new Date();
    expire.setTime(expire.getTime() + (seconden * 1000));
    document.cookie = cookieNaam + "=" + waarde + ";expires=" + expire.toUTCString();
}
