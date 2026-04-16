const prompt = require('prompt-sync')();

let chicos = parseInt(prompt('Introduce el número de chicos que hay en clase: '));
let chicas = parseInt(prompt('Introduce el número de chicas que hay en clase: '));

let total = chicos + chicas;

let pChicos = (chicos * 100) / total;
let pChicas = 100 - pChicos;

console.log('Hay un '+ pChicos+'% de chicos.');
console.log('Hay un '+ pChicas+'% de chicas.');