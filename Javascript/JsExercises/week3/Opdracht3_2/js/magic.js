addEventListener('load', init, false);

function init() {
    let set = document.getElementById("set");
    set.addEventListener('click', klik, false);
}

function klik() {
    let list = document.getElementById("list");
    list.style.listStyleType = "circle";
    let li = document.getElementsByTagName("li");
    for (let i = 0; i < li.length; i++) {
        li[i].innerHTML = i+i+102;
    }
}