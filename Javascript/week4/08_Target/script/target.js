addEventListener("load", init, false);

function init() {
    let buttons = document.querySelectorAll("input");
    for (let i = 0; i < buttons.length; i++) {
       buttons[i].addEventListener("click", whichButton, false);
    }
}

function whichButton(event) {
    let spans = document.querySelectorAll("span");
    spans[0].innerHTML = event.target.id;
    spans[1].innerHTML = event.target.value;
    spans[2].innerHTML = event.target.nodeName;
}
v