const greet = (name) => console.log(`Hello, ${name}!`);

const forEach = (array, callbackFunction) => {
  for (let element of array) {
    callbackFunction(element)
  }
}

const names = ['Emily', 'Dave', 'Jessica']

forEach(names, greet);

const sayGoodbye = (name) => {
  console.log(`Goodbye, ${name}`)
}

forEach(names, sayGoodbye);