window.addEventListener('load', init, false);

function init() {
    let klein = document.getElementById("klein");
    let normaal = document.getElementById("normaal");
    let groot = document.getElementById("groot");
    klein.addEventListener("click", kleiner, false);
    normaal.addEventListener("click", normaler, false);
    groot.addEventListener("click", groter, false);
}

function kleiner() {
    let p = document.getElementsByTagName("p");
    for (let i = 0; i < p.length; i++) {
        p[i].style.fontSize = "10px";
    }
}

function normaler() {
    let p = document.getElementsByTagName("p");
    for (let i = 0; i < p.length; i++) {
        p[i].style.fontSize = "14px";
    }
}

function groter() {
    let p = document.getElementsByTagName("p");
    for (let i = 0; i < p.length; i++) {
        p[i].style.fontSize = "18px";
    }
}