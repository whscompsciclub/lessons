// Comment
/*
 * Long comment
 */
"use strict";
temp = "hey"; // ILLEGAL under "use strict"; unnamed variable / undeclared variables
let name = "John Smith"; // block-scoped variable; encouraged
var dob = "2000-06-30"; // function-scoped; not encouraged
const hs_graduation = 2022; // block-scoped; use whenever you can
hs_graduation = 2021; // ILLEGAL

// Print
console.log("Hello world!")
{
    let k = "temp";
    console.log(k);
    {
        console.log(k);
    }
    var num = 3;
}
console.log(k); // ILLEGAL

console.log(num);

condition1 = true;
condition2 = false;
condition3 = true;
condition4 = false;

if (condition1 && condition2) {
    // ...
}
else if (condition2 || condition3) {
    // ...
}
else if (condition1 && condition3 || condintion4) {
    // ...
}
else {
    // ...
}

while (condition1) {
    // ...
}

arr = [1, 2, 3];
// C-style for loop
for (let i = 0; i < arr.length; i++) {
    console.log(arr[i]);
}

console.log(arr.toString());
console.log(arr.join(" / ")); // "1 / 2 / 3"
arr.pop(); // [1, 2]
arr.push(4); // [1, 2, 4]
arr.shift(); // [2, 4]
arr.unshift(5); // [5, 2, 4]

var sayHello = function greet(name) {
    console.log("Hello,", name);
};
function test(name) {
    console.log(name);
};
sayHello("John");
greet("John");