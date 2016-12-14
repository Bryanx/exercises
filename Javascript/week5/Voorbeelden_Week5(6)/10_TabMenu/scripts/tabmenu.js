window.addEventListener("load", init, false);

function init() {
    showTabContents("tab1");
    let contents = document.getElementById("tablinks");
    let links = contents.getElementsByTagName("a");
    for (let i = 0; i < links.length; i++) {
        links[i].addEventListener("click", tabClicked, false);
    }
}

function showTabContents(tabId) {
    let contents = document.querySelector("#tabcontents");
    let tabs = contents.querySelectorAll("div");
    for (let i = 0; i < tabs.length; i++) {
        tabs[i].style.display = "none";
    }
    document.getElementById(tabId).style.display = "block";
}


function tabClicked(event) {
    let contents = document.getElementById("tablinks");
    let links = contents.getElementsByTagName("a");
    for (let i = 0; i < links.length; i++) {
        links[i].className = "";
    }
    let theLink = event.target;
    theLink.className = "active";
    let theTabId = theLink.getAttribute("href");
    theTabId = theTabId.slice(1, theTabId.length); // # weghalen
    showTabContents(theTabId);
    event.preventDefault(); // Moet verder niets doen
}
