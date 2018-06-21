addEventListener('load', init, false);

function init() {
    document.getElementById("tel").addEventListener("blur", valideerTelefoon, false);
    document.getElementById("iban").addEventListener("blur", valideerRekeningNummer, false);
    document.getElementById("plaat").addEventListener("blur", valideerNummerPlaat, false);
    document.getElementById("email").addEventListener("blur", valideerEmail, false);
}

function isGeldigTelefoonnummer(nummer) {
    let tel = document.getElementById("tel").value;
    const regEx = /^[0-9]\d{1,2}\/[0-9]\d{1,2}\.[0-9]\d\.[0-9]\d$/;
    return regEx.test(tel);
}

function isGeldigRekeningNummer(rekening) {
    let iban = document.getElementById("iban").value;
    const regEx = /^BE(\d{2}-\d{4}-\d{4}-\d{4}|\d{14})$/;
    return regEx.test(iban);
}

function isGeldigeNummerplaat(plaat) {
    let plaat = document.getElementById("plaat").value;
    const regEx = /^([0-9]{1}-)?(([A-Z]{3}-[0-9]{3})|([0-9]{3}-[A-Z]{3}))$/;
    return regEx.test(plaat);
}

function isGeldigEmailAdres(email) {
    let email = document.getElementById("email").value;
    const regEx = /^(\w|\W)+(\w|\W)+@([a-z]*\.[a-z]+\.[a-z]+$|[a-z]+\.[a-z]+$)/;
    return regEx.test(email);
}

function valideerNummerPlaat() {
    let plaat = document.getElementById("plaat").value;
    let fout = document.getElementById("plaatFout");
    fout.innerHTML = "";
    if (!isGeldigeNummerplaat(plaat))
        fout.innerHTML = "formaat: 1-ABC-123 of 123-ABC of ABC-123";
}

function valideerTelefoon() {
    let telefoon = document.getElementById("tel").value.trim();
    let fout = document.getElementById("telFout");
    fout.innerHTML = "";
    if (!isGeldigTelefoonnummer(telefoon))
        fout.innerHTML = "formaat: 0x/xxx.xx.xx of 0xx/xx.xx.xx of 0xxx/xx.xx.xx";
}

function valideerRekeningNummer() {
    let iban = document.getElementById("iban").value.trim();
    let fout = document.getElementById("ibanFout");
    fout.innerHTML = "";
    if (!isGeldigRekeningNummer(iban))
        fout.innerHTML = "formaat: BExx xxxx xxxx xxxx of BExxxxxxxxxxxxxx";
}

function valideerEmail() {
    let email = document.getElementById("email").value;
    let fout = document.getElementById("emailFout");
    fout.innerHTML = "";
    if (!isGeldigEmailAdres(email))
        fout.innerHTML = "formaat: xxx@student.kdg.be of xxx@kdg.be";
}



