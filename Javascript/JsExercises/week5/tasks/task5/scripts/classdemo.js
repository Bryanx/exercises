window.addEventListener('load', init, false);

function init() {
    let alinea = document.getElementsByClassName("alinea");
    for (let i = 0; i < alinea.length; i++) {
        alinea[i].addEventListener("mouseover", hover, false);
    }
}

function hover() {
    let alinea = document.getElementsByClassName("alinea");
    for (let i = 0; i < alinea.length; i++) {
        if (i%2 == 0) {
            alinea[i].style.color = "blue";
        } else {
            alinea[i].style.backgroundColor = "blue";
            alinea[i].style.color = "#ffe4c4";
        }
    }
}