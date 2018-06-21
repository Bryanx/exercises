addEventListener("load", demo, false);

function demo() {
    let lijstje = document.getElementsByTagName("li");
    document.getElementsByClassName("aantal")[0].innerHTML = lijstje.length;
    for (let i = 0; i < lijstje.length; i++) {
        lijstje[i].innerHTML = lijstje[i].innerHTML.toUpperCase();
    }
}

