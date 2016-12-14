addEventListener("load", init, false);

function init() {
   let button = document.querySelector("button");
   button.addEventListener("click", wijzigUitzicht, false);
}

function wijzigUitzicht() {
    let alineas = document.querySelectorAll("p");
    for (let i = 0; i < alineas.length; i++) {
        if (i % 2 === 0) {
            alineas[i].className = "normaal";
        } else {
            alineas[i].className = "code";
        }
        if (i === 4) {
            alineas[4].className = "speciaal";
        }
    }
}
