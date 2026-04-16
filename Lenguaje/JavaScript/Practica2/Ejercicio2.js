const prompt = require('prompt-sync')();

let texto = prompt('Introduce una cadena de texto: ');

let posicion = prompt('Introduce una posición de dicha cadena (1 es la primera letra izquierda): ');

let caracter = texto[posicion];

console.log('El carácter en posición '+ posicion + ' es ' + caracter )