addEventListener("load", init, false);

function init() {
    let button = document.getElementById("set");
    button.addEventListener("click", vervolg, false);
}

function vervolg() {
    // let borderItem = document.querySelector(".border");
    // let kleurItem = document.querySelector(".kleur");
    let css = document.getElementById("css");
    sheet = css.stylesheet;
    sheet.insertRule(".border { border: 1px solid blue; }", 0);
    // borderItem.style.borderColor = "blue";
    // borderItem.style.borderWidth = "1px";
    // borderItem.style.width = "8%";
    //
    // kleurItem.style.color = "blue";
    // kleurItem.style.width = "8%";
}