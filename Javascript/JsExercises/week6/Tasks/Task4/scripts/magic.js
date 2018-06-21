window.addEventListener('load', init, false);

function init() {
    let today = new Date();
    let h = today.getHours();
    let m = today.getMinutes();
    let s = today.getSeconds();
    m = checkTime(m);
    s = checkTime(s);
    document.getElementById('klok').innerHTML = h + ":" + m + ":" + s;
    setTimeout(init, 500);

}
function checkTime(i) {
    if (i < 10) {i = "0" + i}
    return i;
}