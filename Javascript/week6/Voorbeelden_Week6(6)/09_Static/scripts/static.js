/**
 * Created by Kristiaan on 16/12/2016.
 */
window.addEventListener("load", demo, false);

class Util {
    static sum(array) {
        let total = 0;
        for (let i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total;
    }

    static maximum(array) {
        //TODO: "..." is een variabel aantal argumenten.
        return Math.max(...array);
        // ES5 --> return Math.max.apply(null, array);
    }
}

function demo() {
    let myArray = [17, 57, 68, 78, 12];
    let alineas = document.querySelectorAll("p");
    //TODO: static methodes: Util.sum
    alineas[0].innerHTML = "Som: " + Util.sum(myArray);
    alineas[1].innerHTML = "Max: " + Util.maximum(myArray);
}