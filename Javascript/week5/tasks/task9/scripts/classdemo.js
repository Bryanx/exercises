window.addEventListener('load', init, false);

function init() {
    teller = 1;
    body = document.getElementsByTagName("body")[0];

    afleverAdres();

    let checkbox = document.createElement("input");
    checkbox.setAttribute("type", "checkbox");
    let checkboxtext = document.createElement("label");
    checkboxtext.innerHTML = "Het factuuradres is anders dan het afleveradres";
    body.appendChild(checkbox);
    body.appendChild(checkboxtext);

    factuurAdres();

    checkbox.addEventListener("change", check, false);

    let emailadres = document.createElement("h2");
    emailadres.innerHTML = "Emailadres";

    let email = document.createElement("label");
    email.setAttribute("for", "input1");
    email.innerHTML = "Email: ";
    let input1 = document.createElement("input");
    input1.setAttribute("type", "text");
    body.appendChild(emailadres);
    body.appendChild(email);
    body.appendChild(input1);
}

function afleverAdres() {
    let h1 = document.createElement("h1");
    h1.innerHTML = "Dynamisch aanpassen van form";
    let h2 = document.createElement("h2");
    h2.innerHTML = "Afleveradres";

    let p1 = document.createElement("p");
    let naam = document.createElement("label");
    naam.setAttribute("for", "naam");
    naam.innerHTML = "Naam: ";
    let input1 = document.createElement("input");
    input1.setAttribute("type", "text");

    let p2 = document.createElement("p");
    let adres = document.createElement("label");
    adres.setAttribute("for", "adres");
    adres.innerHTML = "Adres: ";
    let input2 = document.createElement("input");
    input2.setAttribute("type", "text");

    let p3 = document.createElement("p");
    let plaats = document.createElement("label");
    plaats.setAttribute("for", "plaats");
    plaats.innerHTML = "Plaats: ";
    let input3 = document.createElement("input");
    input3.setAttribute("type", "text");


    let body = document.getElementsByTagName("body")[0];
    body.appendChild(h1)
    body.appendChild(h2);
    p1.appendChild(naam);
    p1.appendChild(input1);
    p2.appendChild(adres);
    p2.appendChild(input2);
    p3.appendChild(plaats);
    p3.appendChild(input3);
    body.appendChild(p1);
    body.appendChild(p2);
    body.appendChild(p3);
}

function factuurAdres() {
    let factuur = document.createElement("h2");
    factuur.setAttribute("id", "factuur");
    factuur.innerHTML = "Factuuradres";

    let p1 = document.createElement("p");
    p1.setAttribute("id", "p1");

    let naam = document.createElement("label");
    naam.setAttribute("for", "naam");
    naam.innerHTML = "Naam: ";
    let input1 = document.createElement("input");
    input1.setAttribute("type", "text");

    let p2 = document.createElement("p");
    p2.setAttribute("id", "p2");

    let adres = document.createElement("label");
    adres.setAttribute("for", "adres");
    adres.innerHTML = "Adres: ";
    let input2 = document.createElement("input");
    input2.setAttribute("type", "text");

    let p3 = document.createElement("p");
    p3.setAttribute("id", "p3");

    let plaats = document.createElement("label");
    plaats.setAttribute("for", "plaats");
    plaats.innerHTML = "Plaats: ";
    let input3 = document.createElement("input");
    input3.setAttribute("type", "text");

    body.appendChild(factuur);
    factuur.style.display = "none";
    p1.appendChild(naam);
    p1.appendChild(input1);
    p2.appendChild(adres);
    p2.appendChild(input2);
    p3.appendChild(plaats);
    p3.appendChild(input3);
    body.appendChild(p1);
    p1.style.display = "none";
    body.appendChild(p2);
    p2.style.display = "none";
    body.appendChild(p3);
    p3.style.display = "none";
}

function check() {
    let factuur = document.getElementById("factuur");
    let p1 = document.getElementById("p1");
    let p2 = document.getElementById("p2");
    let p3 = document.getElementById("p3");

    teller++;
    if (teller % 2 == 0) {
        factuur.style.display = "block";
        p1.style.display = "block";
        p2.style.display = "block";
        p3.style.display = "block";
    } else {
        factuur.style.display = "none";
        p1.style.display = "none";
        p2.style.display = "none";
        p3.style.display = "none";
    }
}

