let age = 17;
let age1 = 0;

function checkMyAge(age) {

    if (age <= 17) {
        return "Underage";
    
    } else if (age <= 65) {
        return "Insurable";
    
    } else {
        return "out of range";
    }
}


document.write(`I am ${age}, so I am ${checkMyAge(age)}.` + "<br>");
document.write(`I am ${age = 25}, so I am ${checkMyAge(age)}.` + "<br>");
document.write(`I am ${age = 69}, so I am ${checkMyAge(age)}.` + "<br>");

document.write(`I am ${age1 = 13}, so I am ${ age1 >= 18 ? "Insurable" : "out of range, for more or less"}`+ "<br>");
document.write(`I am ${age1 = 26}, so I am ${ age1 >= 18 ? "Insurable" : "out of range, for more or less"}`+ "<br>");
