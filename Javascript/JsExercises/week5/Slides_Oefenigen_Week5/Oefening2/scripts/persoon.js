addEventListener("load", init, false);

class Adres {
    constructor(straat, postnummer, gemeente) {
        this._straat = straat;
        this._postnummer = postnummer;
        this._gemeente = gemeente;
    }

    get straat() {
        return this._straat;
    }

    get postnummer() {
        return this._postnummer;
    }

    get gemeente() {
        return this._gemeente;
    }

    toString() {
        return this._straat + ", " + this._postnummer + ", " + this._gemeente;
    }
}

function init() {
    let adres = new Adres("Amstelstraat", 1503, "Amsterdam");
    let persoon = new Persoon("Bryan", adres);
    let spans = document.querySelectorAll("span");
    spans[0].innerHTML = persoon.naam;
    spans[0].style.color = "orangered";
    spans[1].innerHTML = persoon.adres;
    spans[1].style.color = "orangered";
}

class Persoon {
    constructor(naam, adres) {
        this.naam = naam;
        this.adres = adres;
    }

    toString() {
        return this.naam + this.adres;
    }
}




