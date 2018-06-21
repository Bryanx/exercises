addEventListener("load", demo6, false);

function demo6() {
    let lijstje = document.getElementsByTagName("li");
    let kleuren = ["red", "#008000", "blue"];

    for (let i = 0; i < lijstje.length; i++) {
        lijstje[i].style.color = kleuren[i];
        lijstje[i].style.listStyleType = "none";
    }
}

