
localStorage.name = "Bryan";
localStorage.age = 26;

sessionStorage.name = "James";
sessionStorage.age = 24;


document.getElementById("naam").addEventListener("keyup", (e) => {
    localStorage.naam = e.target.value;
});

if (localStorage.naam) {
    document.getElementById("welkom").innerHTML += " " + localStorage.naam;
}
