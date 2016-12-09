window.addEventListener('load', init, false);

function init() {
    let submit = document.getElementById("myform");
    let naamField = document.getElementById("naam");
    let leeftijdField = document.getElementById("leeftijd");

    submit.addEventListener('submit', valideer, false); // listener op form!
    naamField.addEventListener('blur', valideerNaam, false);
    leeftijdField.addEventListener('blur', valideerLeeftijd, false);
}

function valideerNaam() {
  let naamField = document.getElementById("naam");
  naamField.style.background = "white";

  let naam = naamField.value.trim();
  if (naam.length < 2) {
     naamField.style.background = "yellow";
     naamField.value = "Naam te kort!";
     return false;
  }
  return true;
}

function valideerLeeftijd() {
    let leeftijdField = document.getElementById("leeftijd");
    leeftijdField.style.background = "white";

    let leeftijd = parseInt(leeftijdField.value, 10);
    if (isNaN(leeftijd) || leeftijd < 0 || leeftijd > 130) {
        leeftijdField.style.background = "yellow";
        leeftijdField.value = "Onmogelijke leeftijd!";
        return false;
    }
    return true;
}

function valideer(event) {
   let naamOk  = valideerNaam();
   let leeftijdOk = valideerLeeftijd();

   if (!naamOk || !leeftijdOk) {
       event.preventDefault();
   }
}
