$(document).ready(function() {
    

});

function addTodo() {
    $.ajax({
        url: 'http://localhost:8080/demoapi/todo',
        type: 'GET',
        success: function (res) {
            let ul_todoList = document.getElementById('todoList');
            res.map(function (todo) {
                let htmlString = `
                    <li>
                        <span>${todo.id}</span>
                        :
                        <span>${todo.text}</span>
                    </li>
                `;
                ul_todoList.innerHTML += htmlString;
            })
        }
    })
}