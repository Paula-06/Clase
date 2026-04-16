const prompt = require('prompt-sync')();

let num1 = parseFloat(prompt('Introduce un número decimal: '));
let num2 = parseFloat(prompt('Introduce otro número decimal: '));

let suma = num1 + num2;
let diferencia = num1 - num2;
let producto = num1 * num2;
let cociente = num1 / num2;

console.log("Su suma es: " + suma);
console.log("Su diferencia es: " + diferencia);
console.log("Su producto es: " + producto);
console.log("Su cociente es: " + cociente);