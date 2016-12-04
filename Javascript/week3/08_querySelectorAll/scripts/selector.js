addEventListener("load", demo, false);

function demo() {
    let list = document.querySelectorAll("h2, p.wel");
    //Geeft alle elementen terug die
    //overeenkomen met een css selector(s)
    for (let i = 0; i < list.length; i++) {
        list[i].style.color = "red";
    }
}
