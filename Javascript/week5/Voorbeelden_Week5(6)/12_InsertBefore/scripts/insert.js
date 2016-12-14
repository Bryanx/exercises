window.addEventListener("load", init, false);

function init() {
    let span = document.createElement("span");
    let tekst = document.createTextNode("blabla");
    span.appendChild(tekst);
    span.style.color = "blue";
    let para = document.getElementById("p1");
    para.appendChild(span);

    span = document.createElement("span");
    span.setAttribute("id", "newSpan");
    let content = document.createTextNode("Nieuwe tekst komt ");
    span.appendChild(content);
    span.style.color = "red";
    let child = document.getElementById("childSpan");
    let parentDiv = child.parentNode;
    parentDiv.insertBefore(span, child);
}
