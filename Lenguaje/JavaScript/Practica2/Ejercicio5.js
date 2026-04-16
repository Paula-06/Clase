const prompt = require('prompt-sync')();

let texto = prompt('Introduce una cadena de texto: ')

let posI = prompt('Introduce una posición inicial (1 es la primera letra izquierda): ')

let posF = prompt('Introduce una posición final (1 es la primera letra izquierda): ')

let sub1 = texto.substring(posI, posF);

console.log('La subcadena de texto de ' + texto + ' entre la posición inicial ' + posI + ' y la posición final ' + posF + ' es = '  + sub1)