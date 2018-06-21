window.addEventListener('load', init, false);

function init() {
    let tr = document.getElementsByTagName("tr");
    for (let i = 0; i < tr.length; i++) {
        if (i%2 != 0) {
            tr[i].style.backgroundColor = "lightgrey";
        }
    }
}