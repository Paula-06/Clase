const prompt = require('prompt-sync')();

let N = parseFloat(prompt("Introduce la cantidad que quieres repartir: "));

let a = parseInt(prompt('Introduce la primera cantidad entre la que repartir: '));
let b = parseInt(prompt('Introduce la segunda cantidad entre la que repartir: '));
let c = parseInt(prompt('Introduce la tercera cantidad entre la que repartir: '));


let k = N/(a+b+c);

let cantA = k * a;
let cantB = k * b;
let cantC = k * c;


console.log('A la cantidad ' + a + ' le corresponde : ' + cantA)
console.log('A la cantidad ' + b + ' le corresponde : ' + cantB)
console.log('A la cantidad ' + c + ' le corresponde : ' + cantC)