window.addEventListener('load', init, false);

function init() {
    let btn = document.getElementById("test");
    btn.addEventListener("click", validate, false);
}

function validate() {
    let cijfers = document.getElementById("cijfers");
    let bericht = document.getElementById("bericht");

    if (vierCijfers(cijfers)) {
        bericht.innerHTML = "Invoer Oke.";
    } else {
        bericht.innerHTML = "Invoer fout.";
    }
}

// Zorg ervoor dat het getal niet met een 0 start
function vierCijfers(cijfers) {
    let inhoud = cijfers.value;
    return inhoud >= 1000 && inhoud < 10000;
}
