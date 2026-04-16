const prompt = require('prompt-sync')();

let num1 = parseInt(prompt('Introduce un número entero como base de la potencia: '));
let num2 = parseInt(prompt('Introduce un número entero como exponente de la potencia: '));

let potencia = num1 * num2;

console.log(num1 + ' elevado a ' +num2+ ' = ' + potencia);