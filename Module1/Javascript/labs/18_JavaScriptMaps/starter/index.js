//2
let hanSolo = new Map([
   ["vehicle", "Millenium Falcon"],
   ["bff", "Chebacca"],
   ["sweetheart", "Leia"] 
]);
console.log(hanSolo);

//3
console.log(hanSolo.size);
console.log(hanSolo.get("vehicle"));
console.log(hanSolo.has("sweetheart"));
console.log(hanSolo.has("Jedi"));

//4
hanSolo.set("son", "Ben")
console.log(hanSolo.get("son"));

//5
for ([key, value] of hanSolo) {
    console.log(`${key}, ${value}`);
}

//6
hanSolo.set("bff", "Luke");
console.log(hanSolo);

console.log(hanSolo.size);
hanSolo.delete("son");
console.log(hanSolo.size);

hanSolo.clear();
console.log(hanSolo);

