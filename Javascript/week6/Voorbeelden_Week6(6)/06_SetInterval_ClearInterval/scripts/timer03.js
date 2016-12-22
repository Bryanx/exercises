window.addEventListener('load', init, false);

function init() {
    //om de 2.5 seconde een nieuwe afbeelding.
    let id = setInterval(nextImage, 2500);
    let knop = document.getElementById("ok");
    //bij clear interval wordt na een bepaalde tijd de event afgebroken.
    knop.addEventListener("click", function() { clearInterval(id); }, false);
}

let next = 0;

function nextImage() {
    let images = ["images/cameron.jpg", "images/lucy.jpg", "images/jordana.jpg"];
    let imageId = document.getElementById("angels");

    imageId.src = images[next++];
    if (next == images.length) {
        next = 0;
    }
}
