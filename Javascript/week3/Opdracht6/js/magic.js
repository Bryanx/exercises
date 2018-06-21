addEventListener("load", init, false);

function init(){
    select = document.getElementById("mySelect").childNodes[1];
    select.addEventListener("change", show, false);
}

function show() {
    let select = document.getElementById("selected");
    select.innerHTML = "memento --- Memento";
}