/**
 * Created by Bryan on 24/11/2016.
 */
class Rechthoek {
    constructor(lengte, breedte) {
        this.lengte = lengte;
        this.breedte = breedte;
        this.oppervlakte = breedte * lengte;
        this.omtrek = 2 * (parseInt(this.lengte, 10)) + 2 * (parseInt(this.breedte, 10));
    }
}

class Circle extends Rechthoek {
    constructor(lengte, breedte, straal) {
        super(lengte, breedte);
        this.straal = straal;
        this.oppervlakte = straal * straal * 3.14;
    }
}

let straal = prompt("Geef de straal: ");

let opp = new Circle(0, 0, straal);
alert("Oppervlakte: " + opp.oppervlakte + "\n" +
    "Omtrek: " + opp.omtrek + "\n");

class Person {
    constructor(name, age) {
        this.name = name;
        this.age = age;
    } // Hier geen komma toegestaan!
    show() {  //function
        return this.name + " is " + this.age;
    }
};
let person = new Person("Jos", 45);
console.log(person.show());