window.addEventListener("load", demo, false);

function demo() {
    let elementen = document.querySelectorAll("li");
    elementen[0].innerHTML = window.screen.width;
    elementen[1].innerHTML = window.screen.height;
    elementen[2].innerHTML = window.navigator.userAgent;
    elementen[3].innerHTML = window.location.href;
}

