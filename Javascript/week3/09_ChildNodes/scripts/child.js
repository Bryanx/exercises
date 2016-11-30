addEventListener("load", demo, false);

function demo() {
    let eersteGroet = document.getElementsByClassName("groet")[0];
    let spanElement = eersteGroet.childNodes[1];
    spanElement.innerHTML = "Jos";
}


