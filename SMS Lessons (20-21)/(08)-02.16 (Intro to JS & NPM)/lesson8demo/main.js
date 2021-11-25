// objects
var exampleObject = {
    //in the form of property: value
    property: "value",
    property1: 2,
    firstName: "Bob",
    lastName: "Joe",
    age: 13,
    email: "bobjoe123@gmail.com",
    exfunction: function() {
        return "hi this is a function " + this.property
    }
}

// remember to add () when calling a function
console.log(exampleObject.exfunction())

// various ways to access a "child" of an object
console.log(exampleObject)
console.log(exampleObject.age)
console.log(exampleObject["email"])
const temp = "lastName"
console.log(exampleObject[temp])

/*
// format for looping through an obj
for(variable in object){
    // do something
}
*/

for(tempVar in exampleObject){
     console.log(exampleObject[tempVar])
}

// obj -> array
var arr = Object.values(exampleObject);
console.log(arr)

// end objs, start constructors

// constructor to create a "person"
function Person(first, last, age){  // first, last, and age are parameters
    this.firstName = first;
    this.lastName = last;
    this.age = age;

    // set drive to t/f based off age
    if(age < 16){
        this.drive = false;
    }
    else{
        this.drive = true;
    }

    // method to return the full name
    this.getName = function() {
        return this.firstName + " " + this.lastName
    }

    // method to change the first name
    this.changeFirstName = function(newFirstName){
        this.firstName = newFirstName
    }
}

// create a new var called bobby using the Person constructor
var bobby = new Person("Bobby", "Joey", 15) // first = "Bobby", last = "Joey", age = 15
console.log(bobby)
console.log(bobby.getName())
bobby.changeFirstName("Alice")
console.log(bobby.getName())