addEventListener("load", demo4, false);

function demo4() {
    let lijstje = document.getElementsByTagName("li");
    let invulPlek = document.querySelector("p span");
    invulPlek.innerHTML = lijstje.length;

    for (let i = 0; i < lijstje.length; i++) {
        let eersteItem = lijstje[i].firstChild.nodeValue;
        lijstje[i].innerHTML = eersteItem.toUpperCase();
    }
}