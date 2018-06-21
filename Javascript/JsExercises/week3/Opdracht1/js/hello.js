addEventListener("load", form, false);

function form() {
    let btn = document.getElementById("btn");
    btn.addEventListener("click", dostuff, false);
}

function dostuff(event) {
    event.preventDefault();
    let text = document.getElementById("bericht").value;
    let demo = document.getElementById("demo");
    demo.innerHTML = text;
}