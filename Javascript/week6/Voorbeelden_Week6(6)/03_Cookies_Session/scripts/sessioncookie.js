window.addEventListener('load', init, false);

function init() {
    let submit = document.querySelector("#login");
    submit.addEventListener('submit', verwerkForm, false);
}

function verwerkForm() {
    let deNaam = document.querySelector("#user").value;
    let hetWachtwoord = document.querySelector("#pass").value;

    setSessionCookie("userName", deNaam);
    setSessionCookie("passWord", hetWachtwoord);
}

function setSessionCookie(name, value) {
    document.cookie = name + "=" + value;
}





