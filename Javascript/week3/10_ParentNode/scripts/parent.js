addEventListener("load", demo, false);

function demo() {
    let tweedeSpan = document.querySelectorAll("span")[1];
    tweedeSpan.innerHTML = "Jos";
    let element = tweedeSpan.parentNode;
    element.childNodes[0].nodeValue = "Rot op ";

    let eersteSpan = document.querySelectorAll("span")[0];
    eersteSpan.innerHTML = " parentNode";
}



