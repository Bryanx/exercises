addEventListener("load", demo, false);

function demo() {
    let lijstje = document.getElementsByTagName("li");
    let lengte = lijstje.length;
    document.querySelector("span").innerHTML = lengte;
}

