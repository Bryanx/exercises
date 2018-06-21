addEventListener("load", show, false);

function show() {
    let set = document.getElementById("set");
    set.addEventListener("click", klik, false);
}

function klik(){
    document.getElementsByTagName("li")[0].innerHTML = "102";
    document.getElementsByTagName("li")[1].innerHTML = "104";
    document.getElementsByTagName("li")[2].innerHTML = "106";
    document.getElementsByTagName("li")[3].innerHTML = "108";
}