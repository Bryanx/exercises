/**
 * Created by Bryan on 23/11/2016.
 */

function keerom(woord) {
    return woord.split('').reverse().join('');
}

const woord = "hamerhaai";
const result = keerom(woord);
alert(result);

function zoekInitialen(woord) {
    let letters = "";
    let woorden = woord.split(' ');
    if (woorden.length == 1) return false;
    for (let i = 0; i < woorden.length; i++) {
        letters += woorden[i][0] + ".";
    }
    return letters;
}

const woord = "Jos van de Broek";
const fout = "Jos";
let result = zoekInitialen(woord);
alert(result);

function eersteLetters(lijst) {
    letters = [];
    for (let i; i < lijst.length; i++) {
        letters.append(lijst.charAt[0]);
    }
    return letters;
}

const lijst = ["aap", "noot", "mies"];
result = eersteLetters(lijst);

alert(result);