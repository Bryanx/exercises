addEventListener("load", images, false);

function images() {

    let list = document.getElementsByTagName("img");

    for (let i = 0; i < list.length; i++) {
        const kind = document.createElement("IMG");
        const papa = document.getElementById("groot");

        let img = document.getElementsByTagName("img")[i];

        img.addEventListener("mouseover", function() {
            switch (i) {
                case(0): kind.setAttribute("src", "images/image-bones.jpg");break;
                case(1): kind.setAttribute("src", "images/image-castle.jpg");break;
                case(2): kind.setAttribute("src", "images/image-mentalist.jpg")
            }
            papa.appendChild(kind);
        }, false);

        img.addEventListener("mouseout", function () {
            kind.setAttribute("src", "");
        }, false);
    }
}