window.addEventListener("load", init, false);

class Dier {
    constructor(naam) {
        this.naam = naam;
    }

    laatJeHoren() {
        return this.naam + " maakt een geluid";
    }
}

class Hond extends Dier {
    laatJeHoren() {
        return this.naam + " blaft";
    }
}

function init() {
    let dier = new Dier("Dolfy");
    let hond = new Hond("Blacky");
    let templates = document.querySelectorAll("span");
    templates[0].innerHTML = dier.laatJeHoren();
    templates[1].innerHTML = hond.laatJeHoren();
}