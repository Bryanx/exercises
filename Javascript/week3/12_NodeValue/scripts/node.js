addEventListener("load", demo, false);

function demo() {
    let node = document.querySelector("span");
    let parent = node.parentNode;
    parent.childNodes[0].nodeValue = "Welkom Jos";
}




