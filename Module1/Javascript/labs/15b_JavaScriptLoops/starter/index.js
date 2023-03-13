for (let i = 1; i < 10; i++) {
    console.log(i);
}

let x = 2;
let loopCounter = 0;

while (x < 10000) {

    x = Math.pow(x, 2);
    loopCounter++;

    console.log(`
    x: ${x}
    counter: ${loopCounter}
    
    `);
}