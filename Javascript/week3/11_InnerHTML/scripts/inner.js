addEventListener("load", demo, false);

function demo() {
    let element = document.querySelector(".groet"); // eerste class=="groet"
    let span = document.querySelectorAll("span")[1]; // tweede span
    span.innerHTML = element.innerHTML;
    alert(element.innerHTML);
}




