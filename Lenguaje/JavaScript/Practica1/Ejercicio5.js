const prompt = require('prompt-sync')();

let num1 = parseFloat(prompt('Introduce el radio (en cm) de un círculo: '));
const pi = 3.1416;

let radio = pi * (num1*num1);

console.log('El valor de su área es:' + radio + 'cm^2.')