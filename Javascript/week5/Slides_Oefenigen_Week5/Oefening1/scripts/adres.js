addEventListener("load", init, false);

class Adres {
    constructor(naam, straat, postnummer, gemeente) {
        this._naam = naam;
        this._straat = straat;
        this._postnummer = postnummer;
        this._gemeente = gemeente;
    }

    get naam() {
        return this._naam;
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

    toString(){
        return this._naam + ", " +  this._straat + ", " + this._postnummer + ", " + this._gemeente;
    }
}

function init() {
    let adres = new Adres("Bryan", "Amstelstraat", "1503ED", "Amsterdam");
    let spans = document.querySelectorAll("span");
    spans[0].innerHTML = adres;
    spans[1].innerHTML = adres.naam;
    spans[2].innerHTML = adres.straat;
    spans[3].innerHTML = adres.postnummer + " " + adres.gemeente;
}




