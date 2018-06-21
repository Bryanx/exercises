window.addEventListener("load", init, false);

class Figuur {
    constructor(soort) {
        this.soort = soort;
    }

    toString() {
        return "Ik ben een Figuur";
    }
}

class Vierkant extends Figuur {
    constructor() {
       super("Vierkant");
    }

    toString() {
        return "Ik ben een " + this.soort;
    }
}

class Driehoek extends Figuur {
    constructor() {
        super("Driehoek");
    }

    toString() {
        return "Ik ben een " + this.soort;
    }
}

function init() {
    let figuren = [new Figuur(), new Driehoek(), new Vierkant()];
    let templates = document.querySelectorAll("span");
    for (let i = 0; i < figuren.length; i++) {
        templates[i].innerHTML = figuren[i];
    }
}