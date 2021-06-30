"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
console.log("hola");
// types
var myString = "Buenos dias";
myString = 22 + "";
var myNumber = 33;
var myBool = true;
var myVar = "hola";
myVar = 33;
// Strings
document.write(myString);
// Array
var myArray = ["", "", ""];
myArray = [1, 2, 3];
var arrayString = ["", "", ""];
var arrayNumber = [1, 2, 3];
var arrayBoolean = [false];
// tuplas
var strTupla;
strTupla = ["22", 22];
// in a block
{
    // tipos comunes js: void, undefined, null
    //variables privadas dentro del scope actual
    var myVoid = undefined;
    var myNull = null;
    var myUndefined = undefined;
    // constantes
    var PI = 3.14;
    console.log(typeof myVoid);
}
// functions
function getSuma(num1, num2) {
    return num1 + num2;
}
{
    var myFunc = function (num1, num2) {
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
var getName = function (firstName, lastName) {
    if (lastName == undefined) {
        return firstName;
    }
    return firstName + " " + lastName;
};
getName('jose');
function voidFunction() {
}
function showTodo(todo) {
    console.log("" + todo.text);
}
showTodo({ title: 't', text: 'h' });
{
    var todo = { title: 't1', text: 'h1' };
    showTodo(todo);
}
// Clases
var User = /** @class */ (function () {
    function User(name, email, edad) {
        this.edad = 0;
        this.name = name;
        this.email = email;
        this.edad = edad != undefined ? edad : 0;
    }
    User.prototype.register = function () {
        console.log(this.name + " is registred!");
    };
    User.prototype.showAge = function () {
        return this.edad;
    };
    User.prototype.AgeInYears = function () {
        console.log(this.edad + ' años de edad');
    };
    User.prototype.payInvoice = function () {
        console.log(this.name + " tiene factura pagada");
    };
    return User;
}());
;
var jhon = new User('Jhon');
var Member = /** @class */ (function (_super) {
    __extends(Member, _super);
    function Member(id, name, email, edad) {
        var _this = _super.call(this, name, email, edad) || this;
        _this.id = id;
        return _this;
    }
    return Member;
}(User));
var gordon = new Member(1, 'Gordon', 'gordon@gemail.com', 24);
console.log(gordon.payInvoice());
