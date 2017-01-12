addEventListener('load', init, false);

function init() {
    let btn = document.getElementById("set");
    btn.addEventListener("click", vervolg, false);
}

function vervolg() {
    let css = document.styleSheets[0];
    css.insertRule(".kleur { color: blue; }", 0);
    css.insertRule(".border { border: 1px solid blue; }", 0);
    css.insertRule("p { width: 100px; }", 0);

}