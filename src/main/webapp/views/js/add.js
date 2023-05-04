
$(document).ready(function() {
    const CONTEXT_PATH = `${document.location.origin}/${CTX}`;

    loadDate();

    $('#sendTodo').click(function() {
        console.log(CONTEXT_PATH);
        addTodo(CONTEXT_PATH);
    })
});

function loadDate() {
    let currentdate = new Date();
    let dateString = currentdate.toISOString();
    $('#deadline').val(dateString.substring(0, dateString.lastIndexOf(":")));
}

function addTodo(path) {

    let text = $('#text').val();
    let deadline = $('#deadline').val().toString();


    let todo = {
        text: text,
        deadline: deadline
    }
    
    $.ajax({
        url: `${path}/todo`,
        type: 'POST',
        contentType: 'application/json',
        data: JSON.stringify(todo)
    }).done(function (ketqua) {
        console.log("done")
    })
}