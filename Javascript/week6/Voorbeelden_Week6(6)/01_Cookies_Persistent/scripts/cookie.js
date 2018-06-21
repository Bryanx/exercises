window.addEventListener('load', init, false);

function init() {
    if (document.cookie.indexOf("userName") != -1) {
        let deNaam = document.cookie.split("=")[1]; // kan op één regel zonder variabele deNaam
        document.getElementById("cookie").innerHTML = deNaam;
    }
    document.getElementById("klik").addEventListener('click', setCookie, false);
}

function setCookie() {
    let expire = new Date();
    expire.setTime(expire.getTime() + (30 * 1000)); // 30 seconden

    let deNaam = document.getElementById("naam").value;
    document.cookie = "userName=" + deNaam + ";expires=" + expire.toUTCString();
}
