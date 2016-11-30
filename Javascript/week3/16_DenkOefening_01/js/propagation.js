addEventListener("load", windowLoaded, false);

function windowLoaded() {
    let theLink = document.getElementsByTagName("a")[0];
    let theParagraph = document.getElementsByTagName("p")[0];
    theLink.addEventListener("click", linkClicked, false);
    theParagraph.addEventListener("click", pClicked, false);
}

function linkClicked(event) {
    alert("Link " + event.target + " clicked!");
}

function pClicked(event) {
    alert("Paragraph  " + event.target + " clicked!");
}
