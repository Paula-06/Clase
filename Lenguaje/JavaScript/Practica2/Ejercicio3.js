const prompt = require('prompt-sync')();

let texto = prompt('Introduce una cadena de texto en la que aparezca dos veces la palabra ‘mesa’: ');

let primeraP = texto.indexOf("mesa");

let segundaP = texto.lastIndexOf("mesa");

console.log('La primera palabra ‘mesa’ se encuentra en la posición ' + primeraP)
console.log('La segunda palabra ‘mesa’ se encuentra en la posición ' + segundaP)
