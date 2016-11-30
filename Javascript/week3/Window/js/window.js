window.addEventListener("load", demo, false);

function demo() {
    let url = window.prompt("Geef een URL met https://");
    window.alert("Redirecting to new URL!");
    window.location = url;
}

