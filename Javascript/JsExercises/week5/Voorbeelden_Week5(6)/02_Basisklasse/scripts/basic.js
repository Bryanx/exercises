window.addEventListener("load", init, false);

class Persoon {
    constructor(naam, leeftijd) {
        this.naam = naam;
        this.leeftijd = leeftijd;
    }

    toonNaam() {
        return "Mijn naam is " + this.naam;
    }

    toonLeeftijd() {
        return "Mijn leeftijd is " + this.leeftijd;
    }

    toString() {
        return this.naam + " is  " + this.leeftijd;
    }
}

function init() {
    let persoon = new Persoon("Jos", 59);
    let templates = document.querySelectorAll("span");
    templates[0].innerHTML = persoon.toonNaam();
    templates[1].innerHTML = persoon.toonLeeftijd();
    templates[2].innerHTML = persoon.toString();
}
