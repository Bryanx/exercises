window.addEventListener('load', init, false);

// Waar nodig aan te vullen

function init() {
    let first = document.getElementById("first");
    let back = document.getElementById("back");

    if (!getCookie("userColor")) {
        first.style.display = "block";
        document.getElementById("klik").addEventListener('click', cookieHandler,false);
    } else {
        document.body.style.backgroundColor = '#' + getCookie("userColor");
        first.style.display = "none";
        back.style.display = "block";
    }

}

function cookieHandler() {
    let kleur = document.getElementById("kleur").value;
    document.body.style.backgroundColor = '#' + kleur;
    setCookie("userColor",kleur, 30);
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
    document.cookie = cookieNaam + "=" + waarde +
    ";expires=" + expire.toUTCString();
}
