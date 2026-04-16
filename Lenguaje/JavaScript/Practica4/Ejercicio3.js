const prompt = require('prompt-sync')();

let num = parseInt(prompt('Introduce un número entero del 1 al 7: '));
let dias = ["lunes", "martes", "miércoles", "jueves", "viernes", "sábado", "domingo"];

if (num < 1 || num > 7 ) {
    console.log('ERROR');
} else {        
    console.log(dias[num - 1]);
} 


