const prompt = require('prompt-sync')();

let num1 = parseInt(prompt('Introduce el ancho (en cm) de un rectángulo: '));
let num2 = parseInt(prompt('Introduce el alto (en cm) de un rectángulo: '));

let area = num1 * num2;

console.log('El valor de su área es:' + area + 'cm^2.')