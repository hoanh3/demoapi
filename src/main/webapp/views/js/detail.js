$(document).ready(function() {
    console.log(document.getElementById('todoId').value);
    loadData();
});

function loadData() {
    $.ajax({
        url: `http://localhost:8080/demoapi/todo/${document.getElementById('todoId').value}`,
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