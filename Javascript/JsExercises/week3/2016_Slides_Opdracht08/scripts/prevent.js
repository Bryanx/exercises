window.addEventListener("load", init, false);

function init() {
    let links = document.getElementsByTagName("a");
    for (let i = 0; i < links.length; i++) {
        links[i].addEventListener("click", verbiedLink, false);
    }
}

function verbiedLink(event) {
    event.preventDefault();
    alert("Jij mag niet naar " + event.target + " surfen!");
}



