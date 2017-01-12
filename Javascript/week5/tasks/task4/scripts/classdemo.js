window.addEventListener('load', init, false);

function init() {
    let set = document.getElementById("set");
    set.addEventListener('click', klik, false);
}

function klik() {
    let p = document.getElementsByTagName("p");
    for (let i = 0; i < p.length; i++) {
        if (i % 2 != 0) {
            p[i].innerHTML = "Test";
        } else {
            p[i].style.color = "blue";
        }
    }
}