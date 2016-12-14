window.addEventListener("load", init, false);

class Cirkel {
    constructor(straal) {
       this.straal = straal;
    }

    omtrek() {
        return (2 * Math.PI * this.straal).toPrecision(5);
    }
}

class GekleurdeCirkel extends Cirkel{
    constructor(straal, kleur) {
        super(straal);
        this.kleur = kleur;
    }

    getKleur() {
        return this.kleur;
    }

    set straal(waarde) {
        super.straal = waarde;
    }
}

function init() {
    let cirkel = new Cirkel(2);
    let gekleurdeCirkel = new GekleurdeCirkel(10, "Rood");
    gekleurdeCirkel.straal = 3; // via setter
    let templates = document.querySelectorAll("span");
    templates[0].innerHTML = cirkel.omtrek();
    templates[1].innerHTML = gekleurdeCirkel.omtrek();
    templates[2].innerHTML = gekleurdeCirkel.getKleur();
}