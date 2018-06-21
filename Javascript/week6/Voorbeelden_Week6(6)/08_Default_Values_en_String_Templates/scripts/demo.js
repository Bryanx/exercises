/**
 * Created by Kristiaan on 15/12/2016.
 */
window.addEventListener("load", init, false);

function init() {
    let dozen = [new Doos(20, 8, 3, "wit"), new Doos(30, 20, 10, "beige"), new Doos(50, 40, 20)];
    let alineas = document.querySelectorAll("p");

    for (let i = 0; i < alineas.length; i++) {
       alineas[i].className = "kleur";
       alineas[i].innerHTML = dozen[i];
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