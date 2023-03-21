let nameInput = document.querySelector("[name=name]")


const formSubmit = (e) => {
    e.preventDefault();
    alert("The form has been submitted");

    for(let i = 0; i < 3; i++) {
        console.log(e.target[i].value);
    }

}

// let form = document.getElementById("form");
form.addEventListener("submit", formSubmit);

let validateNameLength = (e) => {
    if(e.target.value.length < 2) {
        alert('Name is not long enough')
        nameInput.focus();
    } 
}

nameInput.addEventListener('change', validateNameLength);


