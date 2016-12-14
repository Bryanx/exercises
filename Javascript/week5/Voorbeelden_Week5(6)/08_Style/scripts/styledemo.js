addEventListener("load", init, false);

function init() {
   let button = document.querySelector("button");
   button.addEventListener("click", showHide, false);
   button.style.fontSize = "large";
   button.style.fontFamily = "Verdana, sansSerif";
   button.style.color = "red";
}

function showHide(event) {
    let image = document.querySelector("img");
    let button = document.querySelector("button");
    if (image.style.display == '' || image.style.display == 'block') {
        image.style.display = 'none';
        button.style.color = "green";
        button.firstChild.nodeValue = "Get me back!";
    } else {
        image.style.display = 'block';
        button.style.color = "red";
        button.firstChild.nodeValue = "Click Me!";
    }
}
