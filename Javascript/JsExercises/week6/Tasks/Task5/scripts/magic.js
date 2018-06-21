window.addEventListener('load', init, false);

function init() {
    let start = document.getElementById("start");
    let stop = document.getElementById("stop");
    let reset = document.getElementById("reset");
    start.addEventListener("click", startfunction, false);
    stop.addEventListener("click", stopfunction, false);
    reset.addEventListener("click", resetfunction, false);
}

startTime = Date.now();

function startfunction() {
    let elapsedTime = Date.now() - startTime;
    let display = document.getElementById("display");
    display.innerHTML = elapsedTime;
    interval = setTimeout(startfunction, 1);
}

function stopfunction() {
    clearTimeout(interval);
}
function resetfunction() {
    let display = document.getElementById("display");
    display.innerHTML = "0:00:00:000";
    startTime = Date.now();
}