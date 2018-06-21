window.addEventListener("load", init, "false");

function init() {
    let add = document.getElementById("add");
    add.addEventListener("click", addElement, false);
}

function addElement() {
    let plaats = document.getElementById('thePlace');
    let node = document.getElementById('theValue'); // hidden node!
    let nummer = (node.value - 1) + 2;
    node.value = nummer;
    let newdiv = document.createElement('div');
    let divIdName = 'nr' + nummer;
    newdiv.setAttribute('id', divIdName);
    let text = 'Element nummer ' + nummer + ' is toegevoegd';
    let textNode = document.createTextNode(text);
    newdiv.appendChild(textNode);
    plaats.appendChild(newdiv);
}
