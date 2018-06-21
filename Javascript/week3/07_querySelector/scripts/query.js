addEventListener("load", demo, false);

function demo() {
    document.querySelector("p.example span#user").innerHTML= "USER";
    // Moet user moet in een span staan
    // Span moet in een parapgrapg staan met de classname example
    document.querySelector("p.example span").innerHTML= "Jos";
}
