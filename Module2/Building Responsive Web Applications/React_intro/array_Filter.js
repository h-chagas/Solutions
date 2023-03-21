/*

💪 Exercise 1: Array filter()

🎯 Your task:
- There is an array of strings called "names" below.
- Use the array filter() method to create a new array from "names" that contains only the short names (three or fewer characters in length).

*/

const names = [
    'Tom',
    'Annabelle',
    'Montgomery',
    'Bob',
    'Ada',
    'Alexandra',
    'Giovanni',
  ]
  
  const shortNames = names.filter( shortName => shortName.length <= 3)
  
  console.log(shortNames)
  
  /* -----------------------------------
  
  💪 Exercise 2: Array filter()
  
  🎯 Your task:
  - There is an array of objects called "dishes" below.
  - Use the array filter() method to create a new array from "dishes" that contains only the Italian dishes.
  
  */
  
  const dishes = [
    {
      name: 'Sushi',
      cuisine: 'Japanese',
    },
    {
      name: 'Pizza',
      cuisine: 'Italian',
    },
    {
      name: 'Quesadilla',
      cuisine: 'Mexican',
    },
    {
      name: 'Arancini',
      cuisine: 'Italian',
    },
  ]
  
  const italianDishes = dishes.filter(itaDish => itaDish.cuisine == 'Italian')
  
  const nonItalianDishes = dishes.filter( noItaDish => noItaDish.cuisine != 'Italian')
  
  console.log(italianDishes)
  console.log(nonItalianDishes)
  
  