// will resume sharp at 3.30 pm  - 5 minutes.

// primitive type annotations:

/* let name: string;
let heightInCentimers: number;
let isActive: boolean; */

// Array type annotations
// const names: [string, number, string,boolean] = ["James", 200, "Rebecca", true];

// function type annotation
/* let sayHello: (name: string) => string;

sayHello = function () {
  return "some string";
};

sayHello("hello"); */

// Object type annotation:
let person: { name: string; heightInCentimeters: number };

person = {
  name: "Mark",
  heightInCentimeters: 183,
  born: 2001,
};
