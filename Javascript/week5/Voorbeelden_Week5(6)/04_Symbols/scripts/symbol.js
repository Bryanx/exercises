window.addEventListener("load", init, false);

let naam = Symbol('naam');
let leeftijd = Symbol('leeftijd');

class Persoon {
    constructor() {
        this[naam] = naam;
        this[leeftijd] = leeftijd;
    }

    get naam() {
        return this[naam];
    }

    set naam(waarde) {
        return this[naam] = waarde;
    }

    get leeftijd() {
        return this[leeftijd];
    }

    set leeftijd(waarde) {
        this[leeftijd] = waarde;
    }
}

function init() {
    let persoon = new Persoon();
    persoon.naam = "Jos";
    persoon.leeftijd = 59;  // symbol via setter
    let templates = document.querySelectorAll("span");
    templates[0].innerHTML = persoon.naam + " is " + persoon.leeftijd;
    persoon.leeftijd = 60; // symbol via setter
    templates[1].innerHTML = persoon.naam + " is " + persoon.leeftijd;
}