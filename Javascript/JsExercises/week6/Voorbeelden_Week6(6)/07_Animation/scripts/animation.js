window.addEventListener("load", function simpleAnimation() {
    let position = 0;
    let size = 10;
    let tekstId = document.getElementById("tekst");

    function move() {
        position++;
        if (position < 10000) {
            tekstId.style.left = position + "px";
            tekstId.style.top = position + "px";
            if (position % 1 == 0) {
                tekstId.style.fontSize = ++size + "px";
                tekstId.style.fontFamily = "Verdana";
            }
            if (position % 10 == 0) {
                tekstId.style.fontFamily = "Times";
            }
            if (position % 5 == 0) {
                tekstId.style.fontFamily = "Trebuchet";
            }
            setTimeout(move, 20);
        }
    }

    move();
}, false);


