"use strict";

console.log("hola");

// types
var myString: string = "Buenos dias";
myString = 22 + "";

var myNumber = 33;
let myBool: Boolean = true;

var myVar: any = `hola`;
myVar = 33;

// Strings

document.write(myString);

// Array
var myArray: any[] = ["", "", ""];
myArray = [1, 2, 3];
var arrayString: String[] = ["", "", ""];
var arrayNumber: number[] = [1, 2, 3];
var arrayBoolean: Boolean[] = [false];

// tuplas
var strTupla: [string, number];
strTupla = ["22", 22];

// in a block
{
  // tipos comunes js: void, undefined, null
  //variables privadas dentro del scope actual
  let myVoid: void = undefined;
  let myNull: null = null;
  let myUndefined: undefined = undefined;
  // constantes
  const PI = 3.14;
  console.log(typeof myVoid);
}

// functions
function getSuma(num1: number, num2: number): number {
  return num1 + num2;
}
{
    let myFunc = (num1: number | string,
            num2: number | string): number => {
        if (typeof (num1) == 'string') {
            num1 = parseInt(num1);
        }
        if (typeof (num2) == 'string') {
            num2 = parseInt(num2);
        }
        return num1 + num2;
  };
}
// parametro opcional
var getName = (firstName: string, lastName?: string): string => {
    if (lastName == undefined) {
        return firstName;
    }
    return `${firstName} ${lastName}`
};

getName('jose');

function voidFunction(): void {
    
}

// Interfaces
interface ITodo { title: string; text: string;}
function showTodo(todo: ITodo) {
    console.log(`${todo.text}`);

}

showTodo({ title: 't', text: 'h' });


{
    let todo: ITodo = { title: 't1', text: 'h1' };
    showTodo(todo)
}

// Clases
class User {
    private name: string;
    public email: string;
    protected edad: number =0;
    
    constructor(name: string, email?: string, edad?: number) {
        this.name = name;
        this.email = email;
        this.edad = edad != undefined ? edad : 0;
    }

    register() {
        console.log(`${this.name} is registred!`);
    }

    showAge() {
        return this.edad;
    }

    private AgeInYears() {
        console.log(this.edad + ' años de edad');
    }
    payInvoice() {
        console.log(`${this.name} tiene factura pagada`)
    }
};

var jhon = new User('Jhon');

class Member extends User {
    id: number;

    constructor(id, name, email, edad) {
        super(name, email, edad);
        this.id = id;
    }
}

var gordon = new Member(1, 'Gordon', 'gordon@gemail.com', 24);
console.log(gordon.payInvoice());