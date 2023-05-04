const CONTEXT_PATH = `${document.location.origin}/${CTX}`;

$(document).ready(function() {
    console.log(CONTEXT_PATH);

    loadData(CONTEXT_PATH);
});

function loadData(path) {
    $.ajax({
        url: `${path}/todo`,
        type: 'GET',
        success: function (res) {
            let ul_todoList = document.getElementById('todoList');
            console.log(res);
            res.map(function (todo) {
                let htmlString = `
                    <li>
                        <span>${todo.id}</span>
                        :
                        <span>${todo.text}</span>
                        :
                        <button>
                            <a href="${document.location.origin}/${CTX}/detail/${todo.id}">View</a>
                        </button>
                    </li>
                `;
                ul_todoList.innerHTML += htmlString;
            })
        }
    })
}