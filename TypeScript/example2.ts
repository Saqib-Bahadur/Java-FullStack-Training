// // // let name:string;

// // // name = "henry";

// // // name = "oliver";

// // // name = 200;

// // // primitive type annotations:

// // // let name:string;
// // // let heightInCentimeters: number;

// // //const names : string[] = ["Jems","Nike"]

// // let x:boolean | "hello" | "hi";

// // x = true;
// // x = false;
// // x = "hello";
// // x = "hi";

// // let y : number & string;

// // type Poet = {
// //     name : string;
// //     born : number;
// // }

// // const PoetLater :  Poet = {
// //     name : "abc",
// //     born : 2000,
// // };
// interface Poet {
//     name : string;
//     born : number;
// }
// interface Poet {
//     name : string;
//     born : number;
// }

// interface Poet {
//     job : string;
// };

// type x = string | number;

// let firstName : x ;
// firstName = "John";
// firstName = 700;

type book = {
    author : string;
    pages? : number;
};
const ok:book = {
    author : "Mark",
    // pages : 400
};