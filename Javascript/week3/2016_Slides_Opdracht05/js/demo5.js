addEventListener("load", demo5, false);

function demo5() {
    document.querySelector("#woord").innerHTML = "echte";

    let lijstje = document.getElementsByTagName("li");
    lijstje[0].setAttribute("class", "eerste");
    lijstje[1].setAttribute("class", "tweede");
    lijstje[2].setAttribute("class", "derde");

    for (let i = 0; i < lijstje.length; i++) {
        lijstje[i].style.listStyleType = "none";
    }
}

