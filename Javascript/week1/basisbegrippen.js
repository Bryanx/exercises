
/**
* Created by Bryan on 16/11/2016.
*/


var counter = 1;
while (counter < 10) {
counter += 1;
console.log(counter);
}

var getal;

getal = -1 == -1;

console.log(getal);

var keuze = prompt("Welke conversie wilt u doen 1:C 2:F");

if (keuze == 1) {
var celsius = prompt("Geef de temperatuur in °C");
console.log(celsius + "°C = " + celsius * 9 / 5 + 32 + "°F")
}else if (keuze == 2) {
var fahrenheit = prompt("Geef de temperatuur in °F");
console.log(fahrenheit + "°F = " + (fahrenheit - 32) * 5 / 9 + "°F")
}


for (i = 0; i<10; i++) {
if (i%2!=0){
console.log("oneven: "+ i);
}
}
console.log("eindwaarde: "+ i);


i = 0;
do {
if (i%2!=0){
console.log("oneven: "+ i);
}
i++;
}while(i<10)
console.log("eindwaarde: "+ i);


i = 0;
while(i<10) {
if (i%2!=0){
console.log("oneven: "+ i);
}
i++;
}
console.log("eindwaarde: "+ i);


var tabel =  ["een", "twee", "drie", "vier", "vijf"];

for (i = 0; i < tabel.length ; i++) {
console.log(tabel[i]);
}

var tabel = ["Meir 16", 2000, 'Antwerpen'];
var regel = "";
for (i = 0; i < tabel.length ; i++) {
console.log(tabel[i]);
}
regel += tabel[1] + tabel[2];

console.log(regel);


var steden = ["Brussel", "Antwerpen", "Gent"];
var postcodes = new Array(3);
postcodes["Brussel"] = 1000;
postcodes["Antwerpen"] = 2000;
postcodes["Gent"] = 9000;

console.log("Postcodes");
for (i=0;i<steden.length;i++){
console.log(steden[i] + " - " + postcodes[steden[i]]);
}

// GETALLEN OP VOLGORDE VAN WAARDE SORTEREN
var tabel = ["appel", "peer", "banaan"];
var extra = ["citroen", "sinaasappel"];
var result = "";

for (i = 0; i < extra.length; i++) {
tabel.push(extra[i]);
}
for (i = 0; i < 5; i++) {
result += tabel.shift() + " ";
}

console.log(result);

function sortNumber(a,b) {
return a - b;
}

// GETALLEN OP VOLGORDE VAN WAARDE SORTEREN
var getallen = [12,19,23,123,121,45,44];
getallen.sort(function sortNumber(a,b) {
    return a - b;
});
console.log(getallen);


//SPLITTE EN REVERSEN VAN EEN STRING:
var zin = prompt('Geef een zin in:');
//console.log(zin.split(' ').reverse().join(' '));
//console.log(zin.split('').sort().join(''));

woord = zin.split(' ');

for (i = 0;i<zin.length;i++){
console.log(woord[i]);
}













