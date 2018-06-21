window.addEventListener('load', init, false);

class Addres {
    constructor(straat, huisnummer, plaats, land) {
        this._straat = straat;
        this._huisnummer = huisnummer;
        this._plaats = plaats;
        this._land = land;
    }

    get straat() {
        return this._straat;
    }

    get huisnummer() {
        return this._huisnummer;
    }

    get plaats() {
        return this._plaats;
    }

    get land() {
        return this._land;
    }

    toString() {
        return this._straat + " " + this._huisnummer + " " + this._plaats + " " + this._land;
    }
}


function init() {
    let adresHHW = new Addres("Stellingmolen", 37, "Heerhugowaard", "Nederland");
    let span = document.getElementsByTagName("span");

    span[0].innerHTML = adresHHW;
    span[1].innerHTML = adresHHW.straat + adresHHW.huisnummer;
    span[2].innerHTML = adresHHW.plaats;
    span[3].innerHTML = adresHHW.land;

}