$(document).ready(function() {
    loadData();

});

function loadData() {
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
                        :
                        <button>
                            <a href="${document.location.origin}/${ctx}/detail/${todo.id}">View</a>
                        </button>
                    </li>
                `;
                ul_todoList.innerHTML += htmlString;
            })
        }
    })
}