let numTest = 45.324568;
console.log(numTest);

let twoDecimalPoints = numTest.toFixed(2);
console.log(Number(twoDecimalPoints));

let stringTest = `I am the very model of a modern major general`;
let stringTestUpper = stringTest.toUpperCase();
let indexOfM = stringTestUpper.indexOf(`M`);
console.log(indexOfM);

let start = stringTestUpper.indexOf("MODEL");
let end = stringTestUpper.lastIndexOf("MAJOR");
console.log(start, end);

let sumString = stringTestUpper.substring(start, end);
console.log(sumString);

document.write("<h1>" + sumString + "</h1>")