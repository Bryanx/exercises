window.addEventListener("load", init, false);
function init() {
    var input = document.getElementById("input");
    input.addEventListener('keydown', keyReport, false);
    input.addEventListener('keypress', keyReport, false);
}
function keyReport(event) {
    var keyCode = event.keyCode;
    var keyCharacter = String.fromCharCode(keyCode);
    var charCode = event.charCode;
    var charCharacter = String.fromCharCode(charCode);
    var report = [
        "Event: " + event.type,
        "Key: " + keyCode + "," + keyCharacter,
        "Char: " + charCode + "," + charCharacter
    ].join("\n");
    alert(report);
}