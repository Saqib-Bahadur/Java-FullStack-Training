export var color = "red";
export let name = "nicholas";
export const magicNumber = 7;

export function sum(num1,num2){
    return num1+num2;
}
export default class Rectangle{
    constructor(length,width){
        this.length = length;
        this.width = width;
    }
}

let inst1 = new Rectangle(100,200);
// convert identifier into bindings