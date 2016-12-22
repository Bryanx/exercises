addEventListener("load", scrollMessage, false);

let msg = "Dit is een voorbeeld van een lopende tekst die je overal in de pagina kunt toepassen";
let pos = 0;

msg = "......." + msg;

function scrollMessage() {

    setTimeout(scrollMessage, 150);
}

doosjes = [new Doos(20, 8, 3, "wit"), new Doos(30, 20, 10, "beige"), new Doos(50, 40, 20)];

class Dozen {
    constructor() {
        this.doosjes = null;
    }

    size() {
        return doosjes.length;
    }

    voegToe(obj) {
        doosjes[Dozen.size() + 1].add(obj);
    }
}

class Doos {
    constructor(lengte, breedte, hoogte, kleur = "bruin") { //TODO:default value!!
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


