const movies = [
    { title: "Jaws", director: "Steven Spielberg", year: "1975" },
    { title: "Star Wars", director: "George Lucas", year: "1977" },
    {
      title: "Avengers: Infinity War",
      director: "Anthony and Joe Russo",
      year: "2018"
    },
    { title: "Top Gun", director: "Tony Scott", year: "1986" },
    { title: "Justice League", director: "Zack Snyder", year: "2017" }
  ];
  
  // Part 1 - Create a function to find a movie and output it's detail
  // function findMovie(movieTitle) {
  //   for (const movie of movies) {
  //     if (movieTitle == movie.title) {
  //       console.log(`The movie is ${movie.title}, whose director is ${movie.director}, launched in ${movie.year}.`);
  //     }
  //     console.log(`The movie is ${movie.title}, whose director is ${movie.director}, launched in ${movie.year}.`);
  //   }
  //   // console.log(`The movie is ${movie.title}, whose director is ${movie.director}, launched in ${movie.year}.`);
  // }
  // // console.log(movie)
  
  // findMovie("Star Wars");

  // let movie = "Thor: Ragnorok";


  // Part 2 = Create a function to return a movie object
  
let returnMovie = function(movieTitle) {
  for (const movie of movies) {
    if (movie.title == movieTitle) {
      return movie
    }
      console.log(movie);
      console.log("Any text, any text at all");
  }
}

const myMovie = returnMovie("Avengers: Infinity War");

console.log(myMovie);