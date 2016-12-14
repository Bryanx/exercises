addEventListener("load", init, false);

class Punt {
    constructor(x, y) {
        this.x = x;
        this.y = y;
    }

    toString() {
        return this.x + ", " + this.y;
    }
}

class Punt3D extends Punt {
    constructor(x, y, z) {
        super(x, y);
        this.z = z;
    }

    toString() {
        return super.toString();
    }
}


function init() {
    let punt = new Punt(4, 5);
    let punt3d = new Punt3D(punt, 6);
    let spans = document.querySelectorAll("span");

    for (let i = 0; i<spans.length; i++) {
        spans[i].style.color = "blue";
    }

    spans[0].innerHTML = punt;
    spans[1].innerHTML = punt3d;
}




