/**
 * Created by Bryan on 11-01-17.
 */

addEventListener('load', init, false);

function init() {
    let green = document.getElementById("green");
    let magenta = document.getElementById("magenta");
    let h3 = document.getElementsByTagName("h3")[0].innerHTML;

    if (h3.includes("green")) {
        green.innerHTML = "true";
        green.style.color = "blue";
    } else {
        green.innerHTML = "false";
        green.style.color = "blue";
    }

    if (h3.includes("magenta")) {
        magenta.innerHTML = "true";
        magenta.style.color = "blue";
    } else {
        magenta.innerHTML = "false";
        magenta.style.color = "blue";
    }
}
