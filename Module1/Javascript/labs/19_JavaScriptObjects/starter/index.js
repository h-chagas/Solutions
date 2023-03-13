//2
let darthVader = {
    allegiance: "Empire",
    weapon: "lightsabre",
    sith: true 

}

//3
console.log(`
DarthVader's allegiance: ${darthVader.allegiance}, 
DarthVader's weapon: ${darthVader.weapon}, 
DarthVader's sith: ${darthVader.sith},
DarthVader's Jedi: ${darthVader.jedi},
`);

console.log(Object.keys(darthVader).length);

//4
darthVader.children = 2;
darthVader.childNames = ["Luke", "Leia"];

console.log(`DartVader has ${darthVader.children} children. One of them is called ${darthVader.childNames[0]} and the other ${darthVader.childNames[1]}.`);
console.log(darthVader);

//5
console.log("These are the key/value pairs of the DarthVader object");
for (x in darthVader) {
    console.log(`
    Key: ${x}, Value: ${darthVader[x]},
    `);
}

//6
darthVader.allegiance = "The light side";
console.log(darthVader);

delete darthVader.children;
console.log(darthVader);

let {allegiance, weapon, sith, childNames} = darthVader
console.log(allegiance);
console.log(weapon);
console.log(sith);
console.log(childNames);

darthVader = {};
console.log(darthVader);

