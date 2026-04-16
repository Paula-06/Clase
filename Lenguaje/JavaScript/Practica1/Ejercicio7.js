const prompt = require('prompt-sync')();

console.log('Piensa un número… multiplícalo por 3, después súmale al resultado 6, a continuación divide todo entre 2 y finalmente resta uno');

let num = parseFloat(prompt(' Dime el resultado obtenido de las operaciones anteriores: '));


let resultado = ((((num + 1) * 2) - 6) /3);


console.log('El número que pensaste inicialmente es: ' + resultado);