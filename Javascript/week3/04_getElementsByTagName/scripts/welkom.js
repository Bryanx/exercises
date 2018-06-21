addEventListener("load", demo, false);

function demo() {
    let element = document.getElementsByTagName("span")[0];
    element.innerHTML = "Jos";

    document.getElementsByTagName("span")[1].innerHTML = "Jennifer";
}
