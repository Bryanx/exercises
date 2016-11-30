addEventListener("load", demo, false);

function demo() {
    let list = document.querySelectorAll("h2, p.wel");
    for (let i = 0; i < list.length; i++) {
        list[i].style.color = "red";
    }
}
