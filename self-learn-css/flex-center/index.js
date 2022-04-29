function fncWhatIsHobby(hobby) {
  switch (hobby) {
    case "car":
      return function (name) {
        console.log(name + " do you have a car ?");
      };
      break;
  
    case "book":
      return function (name) {
        console.log(name + " what is your favorite author?");
      };
      break;
  
    case "software":
      return function (name, type) {
        console.log(name + " are you interested in " + type + "?");
      };
      break;
  
    default:
      return function (name) {
        console.log(name + "  how are you ?");
      };
      break;
  }
}

// fncWhatIsHobby ile return donen fnc fncInHobby'e atanır.
var fncInHobby = fncWhatIsHobby("book");
fncInHobby("Cemre","nodejs");