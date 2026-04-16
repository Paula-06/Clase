const prompt = require('prompt-sync')();

let texto = prompt('Introduce una cadena de texto: ');

let caracter = texto.length;

console.log('Tu cadena de texto tiene ' + caracter + ' caracteres');