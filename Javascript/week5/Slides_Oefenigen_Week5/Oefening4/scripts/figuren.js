addEventListener("load", init, false);

class Figuur {
    constructor(kleur) {
        this.kleur = kleur;
    }

    toString() {
        return this.kleur;
    }
}

class Driehoek extends Figuur {
    constructor(kleur, basis, hoogte) {
        super(kleur);
        this.basis = basis;
        this.hoogte = hoogte;
    }

    oppervlakte() {
        return this.hoogte*this.basis/2;
    }
}

class Vierkant extends Figuur {
    constructor(soort, zijde) {
        super(soort);
        this.zijde = zijde;
    }

    oppervlakte() {
        return this.zijde*2;
    }
}


function init() {
    let driehoek = new Driehoek("groen", 10, 20);
    let vierkant = new Vierkant("rood", 15);
    let spans = document.querySelectorAll("span");
    spans[0].innerHTML = "Een " + driehoek.kleur + "e driehoek met een oppervlakte van " + driehoek.oppervlakte();
    spans[0].style.color = "blue";
    spans[0].style.fontStyle = "italic";
    spans[1].innerHTML = "Een " + vierkant.kleur + "e driehoek met een oppervlakte van " + vierkant.oppervlakte();
    spans[1].style.color = "blue";
    spans[1].style.fontStyle = "italic";
}




