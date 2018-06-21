addEventListener('load', init, false);

function init() {
    let btn = document.getElementById("set");
    btn.addEventListener("click", vervolg, false);
}

function vervolg() {
    let border = document.getElementsByTagName("p")[0];
    let kleur = document.getElementsByTagName("p")[1];

    kleur.style.color = "blue";
    border.style.borderWidth = "1px";
    border.style.borderColor = "red";
    border.style.borderStyle = "solid";

}