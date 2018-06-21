import $ from 'jquery';
import Hypher from 'hypher';
import nl from 'hyphenation.nl';

$('h1').click(function () {
    const h = new Hypher(nl);
    console.log("test");
    $(this).css("background","red");
    $('p').html(h.hyphenateText($("p").html()));
});