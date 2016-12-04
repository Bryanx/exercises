addEventListener("load", demo, false);

function demo() {
    let eersteGroet = document.getElementsByClassName("groet")[0];
    let spanElement = eersteGroet.childNodes[1];
    // childNodes is een lijstje van alle nodes (elements én
    // textnodes) die onder het element zitten…
    // childNodes[1] verandert het tweede element in de p
    spanElement.innerHTML = "Jos";
}


