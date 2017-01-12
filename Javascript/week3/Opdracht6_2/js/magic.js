addEventListener('load', init, false);

function init() {
    // let sel = document.getElementById("selected");
    // if (document.getElementById('mySelect').value == "night") {
    //     sel.innerHTML = "bla";
    // }
    var yourSelect = document.getElementById("mySelect");
    alert( yourSelect.options[ yourSelect.selectedIndex ].value )
}