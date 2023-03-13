const quote = ["I", "am", "your", "friend"];

console.log(quote);

console.log(quote[2]);

const friend = quote.pop();
console.log(quote);

quote.push("father");
console.log(quote);

quote.unshift("Luke")
console.log(quote);

const erroneousWord = "Luke";
const lukeIsHere = quote.find( (w) => w == erroneousWord)
console.log(lukeIsHere)

let lukeIsAt;
if (lukeIsHere) {
    lukeIsAt = quote.findIndex((w) => w == erroneousWord)
    quote[lukeIsAt] = "No"
    console.log(quote);
}