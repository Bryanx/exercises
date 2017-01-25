window.addEventListener('load', init, false);

function init() {
    let first = document.getElementById("first");
    let back = document.getElementById("back");

    if (!getCookies()) {
        first.style.display = "block";
        let klik = document.getElementById("klik");
        klik.addEventListener("click", cookieHandlers, false);
    }
}

function cookieHandlers() {
    let kleur = document.getElementById("kleur").value;


}