(() => {
    $('article').css("background-color", "#fffd0c");
    $('h1').html("Hallo").addClass("important").css("text-align", "center");
    let firstArticle = $('article:first');
    firstArticle.click(() => firstArticle.html(firstArticle.html().substring(0, 200)));
    $('#input').on("keyup", () => {
        $('form').submit();
    });
    $('form').submit((e) => {
        $('h1').html($('#input').val());
        e.preventDefault();
    });
    $('article').css('margin', '0px 100px');
    $('form').css('margin', '100px').css("text-align","center");
})($);