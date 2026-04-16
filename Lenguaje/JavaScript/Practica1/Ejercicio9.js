const prompt = require('prompt-sync')();

let N = parseFloat(prompt("Introduce la cantidad a repartir de manera inversamente proporcional: "));

let a = parseInt(prompt('Introduce la primera cantidad entre la que repartir: '));
let b = parseInt(prompt('Introduce la segunda cantidad entre la que repartir: '));
let c = parseInt(prompt('Introduce la tercera cantidad entre la que repartir: '));


let k = N/((1/a)+(1/b)+(1/c));

let cantA = k / a;
let cantB = k / b;
let cantC = k / c;


console.log('A la cantidad ' + a + ' le corresponde : ' + cantA)
console.log('A la cantidad ' + b + ' le corresponde : ' + cantB)
console.log('A la cantidad ' + c + ' le corresponde : ' + cantC)