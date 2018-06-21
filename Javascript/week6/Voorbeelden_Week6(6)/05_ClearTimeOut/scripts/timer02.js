window.addEventListener('load', init, false);

function init() {
    let timer = window.setTimeout(vertraagd, 4000);
    let splashId = document.getElementById("splash");
    splashId.addEventListener('click', function() {
        clearTimeout(timer);
        document.getElementById("message").innerHTML = "Ik zei het nog! Nu krijg je het vervolg niet te zien!";
    }, false);
}

function vertraagd() {
    document.getElementById("later").innerHTML = "W817";
}
