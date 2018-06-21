window.addEventListener("load", init, false);

function init() {
    // (2.1)
    let objects = [new Doos(20, 8, 3, "wit"), new Doos(30, 20, 10, "beige"), new Doos(50, 40, 20)];

    // (2.2)
    let dozen = new Dozen();

    // (2.3)
    for (let i =0; i < objects.length; i++) {
        dozen.add(objects[i]);
    }

    // 2.4
    document.querySelector("p").innerHTML = dozen.toString();

}

class Doos {
    constructor(lengte, breedte, hoogte, kleur = "bruin") { // default value
        this.lengte = lengte;
        this.breedte = breedte;
        this.hoogte = hoogte;
        this.kleur = kleur;
    }

    volume() {
        return this.lengte * this.breedte * this.hoogte;
    }

    toString() {   // String templates
        return `Volume: ${this.volume()} --- Kleur: ${this.kleur}`;
    }
}

// (1) Schrijf hier de klasse Dozen

class Dozen {
    constructor() {
        this.dozen = [];
    }

    size() {
        return this.dozen.length;
    }

    add(doos) {
        this.dozen.push(doos);
    }

    toString() {
        let inhoud = "";
        for (let i = 0; this.size(); i++) {
            inhoud += `${this.dozen[i].toString()}<br>`;
        }
        return inhoud;
    }
}