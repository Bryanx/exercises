window.addEventListener("load", init, false);

class Persoon {
    constructor(naam, leeftijd) {
        this.naam = naam;
        this._leeftijd = leeftijd;
    }

    toonNaam() {
        return this.naam;
    }

    get leeftijd() {
        return this._leeftijd;
    }

    set leeftijd(waarde) {
        this._leeftijd = waarde;
    }

}

function init() {
    let persoon = new Persoon("Jos", 59);
    let templates = document.querySelectorAll("span");
    templates[0].innerHTML = persoon.toonNaam() + " is " + persoon.leeftijd;
    persoon.leeftijd = 60; // via setter
    templates[1].innerHTML = persoon.toonNaam() + " is " + persoon.leeftijd;
    persoon._leeftijd = 61;
    templates[2].innerHTML = persoon.toonNaam() + " is " + persoon.leeftijd;
}