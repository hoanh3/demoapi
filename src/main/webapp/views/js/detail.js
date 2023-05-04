
$(document).ready(function() {
    const CONTEXT_PATH = `${document.location.origin}/${CTX}`;
    console.log(CONTEXT_PATH);

    loadData(CONTEXT_PATH);
});

function loadData(path) {
    $.ajax({
        url: `${path}/todo/${document.getElementById('todoId').value}`,
        type: 'GET',
        success: function (todo) {
            let todoElement = document.getElementById('todo');
            
            let htmlString = `
                <span>Id: ${todo.id}</span>
                |
                <span>Text: ${todo.text}</span>
                |
                <span>Deadline: ${todo.deadline}</span>
            `;
            todoElement.innerHTML += htmlString;
        }
    })
}