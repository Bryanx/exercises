window.addEventListener("load", init, false);

function init() {
   let form = document.forms["login"];
   form.addEventListener("submit", loginSubmit, false);
}

function loginSubmit(event) {
   let message = "";
   if (!this.naam.value) {
       message = "Naam niet ingevuld!";
   }
   if (!this.password.value) {
       message = "Wachtwoord niet ingevuld!";
   }
   if (!this.naam.value && !this.password.value) {
       message = "Naam en wachtwoord niet ingevuld!";
   }
   if (message.length > 0) {
       document.querySelector("#feedback").innerHTML = message;
       event.preventDefault();
   }
}

