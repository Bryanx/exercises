addEventListener("load", form, false);

function form() {
    bericht = document.querySelector("#bericht");
    span = document.getElementsByTagName("span");
    let submit = document.getElementsByClassName("button");
    submit.addEventListener("click", klikLink, false);
}

function klikLink(){
    span.innerHTML = bericht;
}